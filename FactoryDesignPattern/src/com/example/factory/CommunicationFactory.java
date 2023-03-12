package com.example.factory;

import com.example.controller.EmailCommunication;
import com.example.controller.PhoneCommunication;
import com.example.interfaces.CommunicationInteface;

/*
 * This class is having the abstraction of the Implementation of different Child Class and using the 
 * Interface Method, we decide the class which needs to be invoked.
 * Thats why this is the Factory Class.
 */


public class CommunicationFactory {

	public CommunicationInteface getProcess(String mode)
	{
		if(mode.equalsIgnoreCase("Email"))
			return new EmailCommunication();
		else if(mode.equalsIgnoreCase("Phone"))
			return new PhoneCommunication();
		else
			return null;
	}
}
