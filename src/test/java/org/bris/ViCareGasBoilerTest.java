package org.bris;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ViCareGasBoilerTest {
	
	static Configuration config;
	static ViCareService vicareService;
	static ViCareGasBoiler boiler;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		config = new Configuration("service.config");
		Assert.assertNotNull(config);
		vicareService = new ViCareService(config);
		Assert.assertNotNull(vicareService);
		boiler = new ViCareGasBoiler(vicareService);
	}

	@Test
	void testGetBurnerActive() {
		Assert.assertNotNull(boiler.getBurnerActive());
	}

	@Test
	void testGetGasConsumptionHeatingDays() {
		Assert.assertNotNull(boiler.getGasConsumptionHeatingDays());
	}

	@Test
	void testGetGasConsumptionHeatingToday() {
		Assert.assertNotNull(boiler.getGasConsumptionHeatingToday());
	}

	@Test
	void testGetGasConsumptionHeatingWeeks() {
		Assert.assertNotNull(boiler.getGasConsumptionHeatingWeeks());
	}

	@Test
	void testGetGasConsumptionHeatingThisWeek() {
		Assert.assertNotNull(boiler.getGasConsumptionHeatingThisWeek());
	}

	@Test
	void testGetGasConsumptionHeatingMonths() {
		Assert.assertNotNull(boiler.getGasConsumptionHeatingMonths());
	}

	@Test
	void testGetGasConsumptionHeatingThisMonth() {
		Assert.assertNotNull(boiler.getGasConsumptionHeatingThisMonth());
	}

	@Test
	void testGetGasConsumptionHeatingYears() {
		Assert.assertNotNull(boiler.getGasConsumptionHeatingYears());
	}

	@Test
	void testGetGasConsumptionHeatingThisYear() {
		Assert.assertNotNull(boiler.getGasConsumptionHeatingThisYear());
	}

	@Test
	void testGetGasConsumptionDomesticHotWaterDays() {
		Assert.assertNotNull(boiler.getGasConsumptionDomesticHotWaterDays());
	}

	@Test
	void testGetGasConsumptionDomesticHotWaterToday() {
		Assert.assertNotNull(boiler.getGasConsumptionDomesticHotWaterToday());
	}

	@Test
	void testGetGasConsumptionDomesticHotWaterWeeks() {
		Assert.assertNotNull(boiler.getGasConsumptionDomesticHotWaterWeeks());
	}

	@Test
	void testGetGasConsumptionDomesticHotWaterThisWeek() {
		Assert.assertNotNull(boiler.getGasConsumptionDomesticHotWaterThisWeek());
	}

	@Test
	void testGetGasConsumptionDomesticHotWaterMonths() {
		Assert.assertNotNull(boiler.getGasConsumptionDomesticHotWaterMonths());
	}

	@Test
	void testGetGasConsumptionDomesticHotWaterThisMonth() {
		Assert.assertNotNull(boiler.getGasConsumptionDomesticHotWaterThisMonth());
	}

	@Test
	void testGetGasConsumptionDomesticHotWaterYears() {
		Assert.assertNotNull(boiler.getGasConsumptionDomesticHotWaterYears());
	}

	@Test
	void testGetGasConsumptionDomesticHotWaterThisYear() {
		Assert.assertNotNull(boiler.getGasConsumptionDomesticHotWaterThisYear());
	}

	@Test
	void testGetBurnerModulation() {
		Assert.assertNotNull(boiler.getBurnerModulation());
	}

	@Test
	void testGetBoilerTemperature() {
		Assert.assertNotNull(boiler.getBoilerTemperature());
	}

	@Test
	void getPowerConsumptionDays() {
		Assert.assertNotNull(boiler.getPowerConsumptionDays());
	}
	
	@Test
	void getPowerConsumptionToday() {
		Assert.assertNotNull(boiler.getPowerConsumptionToday());
	}
	
	@Test
	void getPowerConsumptionWeeks() {
		Assert.assertNotNull(boiler.getPowerConsumptionWeeks());
	}
	
	@Test
	void getPowerConsumptionThisWeek() {
		Assert.assertNotNull(boiler.getPowerConsumptionThisWeek());
	}
	
	@Test
	void getPowerConsumptionMonths() {
		Assert.assertNotNull(boiler.getPowerConsumptionMonths());
	}
	
	@Test
	void getPowerConsumptionThisMonth() {
		Assert.assertNotNull(boiler.getPowerConsumptionThisMonth());
	}
	
	@Test
	void getPowerConsumptionYears() {
		Assert.assertNotNull(boiler.getPowerConsumptionYears());
	}
	
	@Test
	void getPowerConsumptionThisYear() {
		Assert.assertNotNull(boiler.getPowerConsumptionThisYear());
	}

	@Test
	void testGetBurnerHours() {
		Assert.assertNotNull(boiler.getBurnerHours());
	}

	@Test
	void testGetBurnerStarts() {
		Assert.assertNotNull(boiler.getBurnerStarts());
	}

}
