package org.bris.test;

import org.bris.Configuration;
import org.bris.ViCareService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestConfiguration {
	Configuration config;
	ViCareService vicareService;

	@BeforeAll
	void init() {
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
