package com.example.main;

import java.util.ArrayList;
import java.util.List;

import com.example.factory.CommunicationFactory;
import com.example.interfaces.CommunicationInteface;
import com.example.pojo.Employee;

public class FactoryDesignTest {

	private static List<Employee> getEmployeeList()
	{
		List<Employee> employees = new ArrayList<>();

		Employee e1 = new Employee("1", "Abhijit", "abc@gmail.com", "12345", "30", "Kolkata","Phone");
		Employee e2 = new Employee("2", "Arjun", "arj@gmail.com", "45678", "40", "Pune","Email");
		Employee e3 = new Employee("3", "Ashok", "ash@gmail.com", "67890", "20", "Delhi","Email");
		Employee e4 = new Employee("4", "Keshav", "kes@gmail.com", "36864", "32", "Mumbaai","Phone");

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);

		return employees;
	}

	public static void main(String[] args)
	{
		List<Employee> employees = getEmployeeList();
		CommunicationFactory factory = new CommunicationFactory();
		CommunicationInteface process;
		for(Employee emp: employees)
		{
			process = factory.getProcess(emp.getModeOfComm());
			process.process(emp);
		}
	}
}
