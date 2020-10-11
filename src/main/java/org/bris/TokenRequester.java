package org.bris;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.Credentials;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TokenRequester {
	//TODO: move credentials to property file
	private static final String USER = ""; //ViCare-User
	private static final String PASSWD = ""; //ViCare-Password
	private static final String VICARE_OAUTH_CALLBACK_EVEREST = "vicare://oauth-callback/everest";
	private static final String CLIENT_ID = "79742319e39245de5f91d15ff4cac2a8";
	private static final String CLIENT_SECRET ="8ad97aceb92c5892e102b093c7c083fa";
	
	private TokenRequester() {
		throw new IllegalStateException("Utility class");
	}
	
    public static String getAccessToken() throws IOException {
        // Create a new HTTP client
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        // Create the request body

        RequestBody body = new FormBody.Builder()
        		.add("isiwebuserid", USER)
        		.add("hidden-password", "00")
        		.add("isiwebpasswd", PASSWD)
        		.add("submit", "LOGIN")
        		.build();
        Request request = new Request.Builder()
        		.url("https://iam.viessmann.com/idp/v1/authorize?response_type=code&state=&client_id="+ CLIENT_ID + "&scope=openid&redirect_uri="+ VICARE_OAUTH_CALLBACK_EVEREST)
        		.addHeader("Content-Type", "application/x-www-form-urlencoded")
        		.post(body).build();
        // Perform the request, this potentially throws an IOException
        Response response = client.newCall(request).execute();
        String location = response.header("Location");
        String[] temp = location.split("code=");
        
        //Post Token with location code
        RequestBody body3 = new FormBody.Builder()
        		.add("grant_type", "authorization_code")
        		.add("code", temp[1])
        		.add("redirect_uri", VICARE_OAUTH_CALLBACK_EVEREST)
        		.add("client_id", CLIENT_ID)
        		.build();
        Request request2 = new Request.Builder()
        		.url("https://iam.viessmann.com/idp/v1/token")
        		.addHeader("Content-Type", "application/x-www-form-urlencoded")
        		.addHeader("Authorization", "Basic Nzk3NDIzMTllMzkyNDVkZTVmOTFkMTVmZjRjYWMyYTg6OGFkOTdhY2ViOTJjNTg5MmUxMDJiMDkzYzdjMDgzZmE=")
        		.post(body3)
        		.build();
        Response response2 = client.newCall(request2).execute();
        @SuppressWarnings("unchecked")
		Map<String,Object> responseMap = new ObjectMapper().
                readValue(response2.body().byteStream(), HashMap.class);
        // Read the value of the "access_token" key from the hashmap 
        return (String)responseMap.get("access_token");
    }

    // Just a helper metod to create the basic auth header
    private static String createAuthHeaderString(String username, String password) {
        String auth = username + ":" + password;
        byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.US_ASCII));
        return "Basic " + new String(encodedAuth);
    }
}
