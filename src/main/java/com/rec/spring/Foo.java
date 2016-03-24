package com.rec.spring;

public class Foo {

	private Service service;

	public void setService(Service service) {
		this.service = service;
	}

	public String getMessage() {
		return service.getMessage();
	}

}
