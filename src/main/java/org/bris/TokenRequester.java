package org.bris;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TokenRequester {
	
	private TokenRequester() {
		throw new IllegalStateException("Utility class");
	}
	
    public static String getAccessToken(Configuration configuration) throws IOException {
        
    	OkHttpClient client = new OkHttpClient().newBuilder().build();

        String authorizationCode = getAuthorizationCode(client,configuration);
        
		return getAccessToken(client, authorizationCode,configuration);
        
    }

	private static String getAccessToken(OkHttpClient client, String authorizationCode, Configuration configuration)
			throws IOException {
		RequestBody body = new FormBody.Builder()
        		.add("grant_type", "authorization_code")
        		.add("code", authorizationCode)
        		.add("redirect_uri", configuration.getProperty("vicare.oauth.callback"))
        		.add("client_id", configuration.getProperty("vicare.client.id"))
        		.build();
        Request request2 = new Request.Builder()
        		.url("https://iam.viessmann.com/idp/v1/token")
        		.addHeader("Content-Type", "application/x-www-form-urlencoded")
        		.addHeader("Authorization", "Basic Nzk3NDIzMTllMzkyNDVkZTVmOTFkMTVmZjRjYWMyYTg6OGFkOTdhY2ViOTJjNTg5MmUxMDJiMDkzYzdjMDgzZmE=")
        		.post(body)
        		.build();
        Response response = client.newCall(request2).execute();
        @SuppressWarnings("unchecked")
		Map<String,Object> responseMap = new ObjectMapper().
                readValue(response.body().byteStream(), HashMap.class);
        response.close();
        return (String)responseMap.get("access_token");
	}

	private static String getAuthorizationCode(OkHttpClient client, Configuration configuration) throws IOException {
		RequestBody body = new FormBody.Builder()
        		.add("isiwebuserid", configuration.getProperty("vicare.user.name"))
        		.add("hidden-password", "00")
        		.add("isiwebpasswd", configuration.getProperty("vicare.user.password"))
        		.add("submit", "LOGIN")
        		.build();
        Request request = new Request.Builder()
        		.url("https://iam.viessmann.com/idp/v1/authorize?response_type=code&state=&client_id="+ configuration.getProperty("vicare.client.id") + "&scope=openid&redirect_uri="+ configuration.getProperty("vicare.oauth.callback"))
        		.addHeader("Content-Type", "application/x-www-form-urlencoded")
        		.post(body).build();
        // Perform the request, this potentially throws an IOException
        Response response = client.newCall(request).execute();
        String location = response.header("Location");
        String[] temp = location.split("code=");
        response.close();
		return temp[1];
	}

    // Just a helper metod to create the basic auth header
    private static String createAuthHeaderString(String username, String password) {
        String auth = username + ":" + password;
        byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.US_ASCII));
        return "Basic " + new String(encodedAuth);
    }
}
