package com.anti.di.airtel;

public class AirTel {
	
	public Service service;

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	
	public void service() {
		 service.service();

	}
}
