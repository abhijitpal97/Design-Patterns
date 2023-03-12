package com.example.driver;

import com.example.pojo.Vehicle;
import com.example.pojo.VehicleBuilder;

public class BuilderDesignMain {

	public static void main(String[] args) {

		Vehicle builder1 = new VehicleBuilder("4", "1500cc").setAirbags(2).build();

		Vehicle builder2 = new VehicleBuilder("8", "4000cc").build();

		Vehicle builder3 = new VehicleBuilder("2", "250cc").build();

		System.out.println(builder1.getWheel());
		System.out.println(builder1.getEngine());
		System.out.println(builder1.getAirbags());

		System.out.println(builder2.getWheel());
		System.out.println(builder2.getEngine());

		System.out.println(builder3.getWheel());
		System.out.println(builder3.getEngine());
	}

}
