package org.bris;

public class ViCareGasBoiler extends VicareDevice {

	
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

	public String getCurrentPower() {
		return super.getService().getProperty("heating.burner.current.power", "value");
	}

	public String getBurnerHours() {
		return super.getService().getProperty("heating.burner.statistics", "hours");
	}

	public String getBurnerStarts() {
		return super.getService().getProperty("heating.burner.statistics", "starts");
	}

}
