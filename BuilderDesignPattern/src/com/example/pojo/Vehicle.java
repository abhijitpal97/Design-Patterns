package com.example.pojo;

public class Vehicle {
	
	private String wheel;
	private String engine;
	private int airbags;	
	
	public String getWheel() {
		return wheel;
	}

	public String getEngine() {
		return engine;
	}
	public int getAirbags() {
		return airbags;
	}


	Vehicle(VehicleBuilder builder) {
		super();
		this.wheel = builder.wheel;
		this.engine = builder.engine;
		this.airbags = builder.airbags;
	}
	
	

}
