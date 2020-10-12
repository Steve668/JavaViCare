package org.bris;

public class ViesmannAPI {
	

	public static void main(String[] args) {

		Configuration config = new Configuration("service.config");		
		
		ViCareService vicareService = new ViCareService(config);
		System.out.println("Install ID " + vicareService.getInstallationId());
		System.out.println("Gateway ID " + vicareService.getGatewayId());
	}

}

