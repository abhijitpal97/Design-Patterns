package com.example.controller;

import com.example.interfaces.CommunicationInteface;
import com.example.pojo.Employee;

public class PhoneCommunication implements CommunicationInteface{

	@Override
	public void process(Employee emp) {
		System.out.println("This communication is related to Phone Communication . User - "+emp.getName());
	}

}
