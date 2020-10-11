package org.bris;

import java.io.IOException;

public class ViesmannAPI {
	

	public static void main(String[] args) {
//		String token = "";
//		try {
//			token = TokenRequester.getAccessToken();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Token :" + token);
		ViCareService vicareService = new ViCareService();
		vicareService.getNewToken();
		vicareService.printAPI();
	}

}

