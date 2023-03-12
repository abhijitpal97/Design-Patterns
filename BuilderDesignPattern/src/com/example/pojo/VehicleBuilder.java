package com.example.pojo;

/*
 * This class is the builder class which is creating the  actual object based on the parameters and returning the object.
 * This helps to protect the actual Class object by keeping only getter method and not setter method.
 */

public class VehicleBuilder {
	
	public String wheel;
	public String engine;
	
	public int airbags;

	public VehicleBuilder(String wheel, String engine) {
		super();
		this.wheel = wheel;
		this.engine = engine;
	}

	public VehicleBuilder setAirbags(int airbags) {
		this.airbags = airbags;
		return this;
	}
	
	public Vehicle build()
	{
		return new Vehicle(this);
	}
}
