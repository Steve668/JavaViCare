package org.bris;

public class ViCareGasBoiler extends VicareDevice {

	
	private String burnerActive;
	private String gasConsumptionHeatingDays;
	private String gasConsumptionHeatingToday;
	private String gasConsumptionHeatingWeeks;
	private String gasConsumptionHeatingThisWeek;
	private String gasConsumptionHeatingMonths;
	private String gasConsumptionHeatingThisMonth;
	private String gasConsumptionHeatingYears;
	private String gasConsumptionHeatingThisYear;
	private String gasConsumptionDomesticHotWaterDays;
	private String gasConsumptionDomesticHotWaterToday;
	private String gasConsumptionDomesticHotWaterWeeks;
	private String gasConsumptionDomesticHotWaterThisWeek;
	private String gasConsumptionDomesticHotWaterMonths;
	private String gasConsumptionDomesticHotWaterThisMonth;
	private String gasConsumptionDomesticHotWaterYears;
	private String gasConsumptionDomesticHotWaterThisYear;
	private String burnerModulation;
	private String boilerTemperature;
	private String currentPower;
	private String burnerHours;
	private String burnerStarts;
	
	public ViCareGasBoiler(ViCareService service) {
		super(service);
	}

	public String getGetBurnerActive() {
		return burnerActive;
	}
	public void setGetBurnerActive(String getBurnerActive) {
		this.burnerActive = getBurnerActive;
	}
	public String getGetGasConsumptionHeatingDays() {
		return gasConsumptionHeatingDays;
	}
	public void setGetGasConsumptionHeatingDays(String getGasConsumptionHeatingDays) {
		this.gasConsumptionHeatingDays = getGasConsumptionHeatingDays;
	}
	public String getGetGasConsumptionHeatingToday() {
		return gasConsumptionHeatingToday;
	}
	public void setGetGasConsumptionHeatingToday(String getGasConsumptionHeatingToday) {
		this.gasConsumptionHeatingToday = getGasConsumptionHeatingToday;
	}
	public String getGetGasConsumptionHeatingWeeks() {
		return gasConsumptionHeatingWeeks;
	}
	public void setGetGasConsumptionHeatingWeeks(String getGasConsumptionHeatingWeeks) {
		this.gasConsumptionHeatingWeeks = getGasConsumptionHeatingWeeks;
	}
	public String getGetGasConsumptionHeatingThisWeek() {
		return gasConsumptionHeatingThisWeek;
	}
	public void setGetGasConsumptionHeatingThisWeek(String getGasConsumptionHeatingThisWeek) {
		this.gasConsumptionHeatingThisWeek = getGasConsumptionHeatingThisWeek;
	}
	public String getGetGasConsumptionHeatingMonths() {
		return gasConsumptionHeatingMonths;
	}
	public void setGetGasConsumptionHeatingMonths(String getGasConsumptionHeatingMonths) {
		this.gasConsumptionHeatingMonths = getGasConsumptionHeatingMonths;
	}
	public String getGetGasConsumptionHeatingThisMonth() {
		return gasConsumptionHeatingThisMonth;
	}
	public void setGetGasConsumptionHeatingThisMonth(String getGasConsumptionHeatingThisMonth) {
		this.gasConsumptionHeatingThisMonth = getGasConsumptionHeatingThisMonth;
	}
	public String getGetGasConsumptionHeatingYears() {
		return gasConsumptionHeatingYears;
	}
	public void setGetGasConsumptionHeatingYears(String getGasConsumptionHeatingYears) {
		this.gasConsumptionHeatingYears = getGasConsumptionHeatingYears;
	}
	public String getGetGasConsumptionHeatingThisYear() {
		return gasConsumptionHeatingThisYear;
	}
	public void setGetGasConsumptionHeatingThisYear(String getGasConsumptionHeatingThisYear) {
		this.gasConsumptionHeatingThisYear = getGasConsumptionHeatingThisYear;
	}
	public String getGetGasConsumptionDomesticHotWaterDays() {
		return gasConsumptionDomesticHotWaterDays;
	}
	public void setGetGasConsumptionDomesticHotWaterDays(String getGasConsumptionDomesticHotWaterDays) {
		this.gasConsumptionDomesticHotWaterDays = getGasConsumptionDomesticHotWaterDays;
	}
	public String getGetGasConsumptionDomesticHotWaterToday() {
		return gasConsumptionDomesticHotWaterToday;
	}
	public void setGetGasConsumptionDomesticHotWaterToday(String getGasConsumptionDomesticHotWaterToday) {
		this.gasConsumptionDomesticHotWaterToday = getGasConsumptionDomesticHotWaterToday;
	}
	public String getGetGasConsumptionDomesticHotWaterWeeks() {
		return gasConsumptionDomesticHotWaterWeeks;
	}
	public void setGetGasConsumptionDomesticHotWaterWeeks(String getGasConsumptionDomesticHotWaterWeeks) {
		this.gasConsumptionDomesticHotWaterWeeks = getGasConsumptionDomesticHotWaterWeeks;
	}
	public String getGetGasConsumptionDomesticHotWaterThisWeek() {
		return gasConsumptionDomesticHotWaterThisWeek;
	}
	public void setGetGasConsumptionDomesticHotWaterThisWeek(String getGasConsumptionDomesticHotWaterThisWeek) {
		this.gasConsumptionDomesticHotWaterThisWeek = getGasConsumptionDomesticHotWaterThisWeek;
	}
	public String getGetGasConsumptionDomesticHotWaterMonths() {
		return gasConsumptionDomesticHotWaterMonths;
	}
	public void setGetGasConsumptionDomesticHotWaterMonths(String getGasConsumptionDomesticHotWaterMonths) {
		this.gasConsumptionDomesticHotWaterMonths = getGasConsumptionDomesticHotWaterMonths;
	}
	public String getGetGasConsumptionDomesticHotWaterThisMonth() {
		return gasConsumptionDomesticHotWaterThisMonth;
	}
	public void setGetGasConsumptionDomesticHotWaterThisMonth(String getGasConsumptionDomesticHotWaterThisMonth) {
		this.gasConsumptionDomesticHotWaterThisMonth = getGasConsumptionDomesticHotWaterThisMonth;
	}
	public String getGetGasConsumptionDomesticHotWaterYears() {
		return gasConsumptionDomesticHotWaterYears;
	}
	public void setGetGasConsumptionDomesticHotWaterYears(String getGasConsumptionDomesticHotWaterYears) {
		this.gasConsumptionDomesticHotWaterYears = getGasConsumptionDomesticHotWaterYears;
	}
	public String getGetGasConsumptionDomesticHotWaterThisYear() {
		return gasConsumptionDomesticHotWaterThisYear;
	}
	public void setGetGasConsumptionDomesticHotWaterThisYear(String getGasConsumptionDomesticHotWaterThisYear) {
		this.gasConsumptionDomesticHotWaterThisYear = getGasConsumptionDomesticHotWaterThisYear;
	}
	public String getGetBurnerModulation() {
		return burnerModulation;
	}
	public void setGetBurnerModulation(String getBurnerModulation) {
		this.burnerModulation = getBurnerModulation;
	}
	public String getGetBoilerTemperature() {
		return boilerTemperature;
	}
	public void setGetBoilerTemperature(String getBoilerTemperature) {
		this.boilerTemperature = getBoilerTemperature;
	}
	public String getGetCurrentPower() {
		return currentPower;
	}
	public void setGetCurrentPower(String getCurrentPower) {
		this.currentPower = getCurrentPower;
	}
	public String getGetBurnerHours() {
		return burnerHours;
	}
	public void setGetBurnerHours(String getBurnerHours) {
		this.burnerHours = getBurnerHours;
	}
	public String getGetBurnerStarts() {
		return burnerStarts;
	}
	public void setGetBurnerStarts(String getBurnerStarts) {
		this.burnerStarts = getBurnerStarts;
	}



}
