package org.bris;

public class VicareDevice {
	
	private ViCareService service;
	
	public VicareDevice(ViCareService service) {
		this.service=service;
	}
	
	public String getPropertyValue(String property) {
		return null;
	}

	public ViCareService getService() {
		return service;
	}

	public void setService(ViCareService service) {
		this.service = service;
	}
}
