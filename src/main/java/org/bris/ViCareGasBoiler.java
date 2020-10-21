package org.bris;

public class ViCareGasBoiler extends VicareDevice {

	
	private static final String HEATING_POWER_CONSUMPTION_TOTAL = "heating.power.consumption.total";
	private static final String HEATING_GAS_CONSUMPTION_HEATING = "heating.gas.consumption.heating";
	private static final String HEATING_GAS_CONSUMPTION_DHW = "heating.gas.consumption.dhw";
	
	public ViCareGasBoiler(ViCareService service) {
		super(service);
	}

	public String getBurnerActive() {
		return super.getService().getProperty("heating.burner", "active");
	}
	
	public String getGasConsumptionHeatingDays() {
		return super.getService().getProperty(HEATING_GAS_CONSUMPTION_HEATING, "day");
	}
	
	public String getGasConsumptionHeatingToday() {
		return super.getService().getProperty(HEATING_GAS_CONSUMPTION_HEATING, "day", 0);
	}

	public String getGasConsumptionHeatingWeeks() {
		return super.getService().getProperty(HEATING_GAS_CONSUMPTION_HEATING, "week");
	}

	public String getGasConsumptionHeatingThisWeek() {
		return super.getService().getProperty(HEATING_GAS_CONSUMPTION_HEATING, "week", 0);
	}

	public String getGasConsumptionHeatingMonths() {
		return super.getService().getProperty(HEATING_GAS_CONSUMPTION_HEATING, "month");
	}

	public String getGasConsumptionHeatingThisMonth() {
		return super.getService().getProperty(HEATING_GAS_CONSUMPTION_HEATING, "month", 0);
	}

	public String getGasConsumptionHeatingYears() {
		return super.getService().getProperty(HEATING_GAS_CONSUMPTION_HEATING, "year");
	}

	public String getGasConsumptionHeatingThisYear() {
		return super.getService().getProperty(HEATING_GAS_CONSUMPTION_HEATING, "year", 0);
	}

	public String getGasConsumptionDomesticHotWaterDays() {
		return super.getService().getProperty(HEATING_GAS_CONSUMPTION_DHW, "day");
	}

	public String getGasConsumptionDomesticHotWaterToday() {
		return super.getService().getProperty(HEATING_GAS_CONSUMPTION_DHW, "day", 0);
	}

	public String getGasConsumptionDomesticHotWaterWeeks() {
		return super.getService().getProperty(HEATING_GAS_CONSUMPTION_DHW, "week");
	}

	public String getGasConsumptionDomesticHotWaterThisWeek() {
		return super.getService().getProperty(HEATING_GAS_CONSUMPTION_DHW, "week", 0);
	}

	public String getGasConsumptionDomesticHotWaterMonths() {
		return super.getService().getProperty(HEATING_GAS_CONSUMPTION_DHW, "month");
	}

	public String getGasConsumptionDomesticHotWaterThisMonth() {
		return super.getService().getProperty(HEATING_GAS_CONSUMPTION_DHW, "month", 0);
	}

	public String getGasConsumptionDomesticHotWaterYears() {
		return super.getService().getProperty(HEATING_GAS_CONSUMPTION_DHW, "year");
	}

	public String getGasConsumptionDomesticHotWaterThisYear() {
		return super.getService().getProperty(HEATING_GAS_CONSUMPTION_DHW, "year", 0);
	}

	public String getBurnerModulation() {
		return super.getService().getProperty("heating.burner.modulation", "value");
	}

	public String getBoilerTemperature() {
		return super.getService().getProperty("heating.boiler.sensors.temperature.main", "value");
	}

	public String getPowerConsumptionDays() {
		return super.getService().getProperty(HEATING_POWER_CONSUMPTION_TOTAL, "day");
	}
	
	public String getPowerConsumptionToday() {
		return super.getService().getProperty(HEATING_POWER_CONSUMPTION_TOTAL, "day", 0);
	}
	
	public String getPowerConsumptionWeeks() {
		return super.getService().getProperty(HEATING_POWER_CONSUMPTION_TOTAL, "week");
	}
	
	public String getPowerConsumptionThisWeek() {
		return super.getService().getProperty(HEATING_POWER_CONSUMPTION_TOTAL, "week", 0);
	}
	
	public String getPowerConsumptionMonths() {
		return super.getService().getProperty(HEATING_POWER_CONSUMPTION_TOTAL, "month");
	}
	
	public String getPowerConsumptionThisMonth() {
		return super.getService().getProperty(HEATING_POWER_CONSUMPTION_TOTAL, "month", 0);
	}
	
	public String getPowerConsumptionYears() {
		return super.getService().getProperty(HEATING_POWER_CONSUMPTION_TOTAL, "year");
	}
	
	public String getPowerConsumptionThisYear() {
		return super.getService().getProperty(HEATING_POWER_CONSUMPTION_TOTAL, "year", 0);
	}

	public String getBurnerHours() {
		return super.getService().getProperty("heating.burner.statistics", "hours");
	}

	public String getBurnerStarts() {
		return super.getService().getProperty("heating.burner.statistics", "starts");
	}

}
