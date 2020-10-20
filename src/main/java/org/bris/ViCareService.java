package org.bris;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.platform.commons.util.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class ViCareService {

	private static Logger logger = Logger.getLogger(ViCareService.class.getName());
	private String token="";
	//TODO: move to property file
	private String apiURLBase = "https://api.viessmann-platform.io";
	private String installationId = ""; //
	private String gatewayId = "";
	private OkHttpClient client = new OkHttpClient().newBuilder().build();

	private Configuration configuration;

	public ViCareService(Configuration configuration) {
		this.setConfiguration(configuration);
		if (token.isEmpty()) {
			token = getNewToken();
		}
		if (installationId.isEmpty()) {
			installationId = configuration.getProperty("vicare.installation.id");
		}
		if (gatewayId.isEmpty()) {
			gatewayId = configuration.getProperty("vicare.gateway.id");
		}
	}

	public void printAPI() {
		Request request = new Request.Builder()
				.url("https://api.viessmann-platform.io/operational-data/v2/installations/" + installationId + "/gateways/" + gatewayId + "/devices/0/features")
				.addHeader("Authorization", "Bearer " + token)
				.build();
		Map<String,Object> responseMap = null;
		try (Response response = client.newCall(request).execute();
			 ResponseBody body = response.body())  {
			responseMap = new ObjectMapper().readValue(response.body().byteStream(), HashMap.class);

			if (logger.isLoggable(Level.INFO)) {
				logger.info(responseMap.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String restoreToken(File tokenFile) {
		if (tokenFile != null && tokenFile.isFile()) {

		}
		return "";
	}

	public Map<String,Object> getURL(String url) {
		Request request = new Request.Builder()
				.url(url)
				.addHeader("Authorization", "Bearer " + token)
				.build();
		Map<String,Object> responseMap = null;
		try (Response response = client.newCall(request).execute();
				ResponseBody body = response.body()) {
			if (response.code()!=200) {
				logger.log(Level.SEVERE, "Url: " + url + " returned an error: Code(" + response.code() + ")" + response.message());
				return null;
			}
			responseMap = new ObjectMapper().readValue(response.body().byteStream(), HashMap.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return responseMap;
	}

	public String getProperty(String propertyName, String parameter, int ... index) {
		String url = 
				apiURLBase + "/operational-data/installations/" + 
				this.installationId + "/gateways/" + 
				this.gatewayId + "/devices/0/features/" +
				propertyName;
		Map<String,Object> responseMap = getURL(url);
		if (responseMap == null) {
			return null;
		}
		if (index.length == 0) {
			return ((LinkedHashMap<?, ?>)((LinkedHashMap<?, ?>)responseMap.get("properties")).get(parameter)).get("value").toString();
		}
		else {
			return ((ArrayList<?>)((LinkedHashMap<?, ?>)((LinkedHashMap<?, ?>)responseMap.get("properties")).get(parameter)).get("value")).get(index[0]).toString();
		}
		
	}

	public void setProperty(String property) {
		//TODO
	}

	public String getNewToken() {
		this.token = "";
		try {
			this.token = TokenRequester.getAccessToken(this.configuration);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return this.token;
	}

	public String getInstallationId() {
		Map<String, Object> map = getURL(apiURLBase+"/general-management/installations?expanded=true");
		return ((LinkedHashMap)((LinkedHashMap)((ArrayList)map.get("entities")).get(0)).get("properties")).get("id").toString();
	}

	public String getGatewayId() {
		Map<String, Object> map = getURL(apiURLBase+"/general-management/gateways?expanded=true");
		return ((LinkedHashMap)((LinkedHashMap)((ArrayList)map.get("entities")).get(0)).get("properties")).get("serial").toString();
	}

	public void setConfiguration(Configuration properties) {
		this.configuration = properties;
	}

}
