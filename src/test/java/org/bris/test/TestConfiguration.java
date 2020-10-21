package org.bris.test;

import org.bris.Configuration;
import org.bris.ViCareService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestConfiguration {
	static Configuration config;
	static ViCareService vicareService;

	@BeforeAll
	static void init() {
		config = new Configuration("service.config");
		Assert.assertNotNull(config);
		vicareService = new ViCareService(config);
		Assert.assertNotNull(vicareService);
	}

	@Test
	void testGetGatewayId() {
		String gatewayId = vicareService.getGatewayId();
		Assert.assertNotEquals("", gatewayId);
	}

	@Test
	void testGetInstallationId() {
		String installationID = vicareService.getInstallationId();
		Assert.assertNotEquals("", installationID);
	}

}
