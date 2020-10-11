package org.bris;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ViCareService {

	private String token;
	//TODO: move to property file
	private static final String INSTALLATION_ID = ""; //
	private static final String GATEWAY_ID = "";

	public void printAPI() {
		OkHttpClient client = new OkHttpClient().newBuilder()
				.build();
		Request request = new Request.Builder()
				.url("https://api.viessmann-platform.io/operational-data/v1/installations/" + INSTALLATION_ID + "/gateways/" + GATEWAY_ID + "/devices/0/features")
				.addHeader("Authorization", "Bearer " + token)
				.build();
		Response response = null;
		Map<String,Object> responseMap = null;
		try {
			response = client.newCall(request).execute();
			responseMap = new ObjectMapper().readValue(response.body().byteStream(), HashMap.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(responseMap);
	}

	public String restoreToken(File tokenFile) {
		if (tokenFile != null && tokenFile.isFile()) {

		}
		return "";
	}

	public String getNewToken() {
		this.token = "";
		try {
			this.token = TokenRequester.getAccessToken();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return this.token;
	}

	public String getInstallationId() {
		//TODO
		return "";
	}

	public String getGatewayId() {
		//TODO
		return "";
	}

}
