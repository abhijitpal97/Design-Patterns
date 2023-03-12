package com.example.pojo;

public class Employee {
	
	private String id;
	private String name;
	private String email;
	private String phone;
	private String age;
	private String city;
	private String modeOfComm;
	
	public String getModeOfComm() {
		return modeOfComm;
	}
	public void setModeOfComm(String modeOfComm) {
		this.modeOfComm = modeOfComm;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee(String id, String name, String email, String phone, String age, String city, String modeOfComm) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.city = city;
		this.modeOfComm = modeOfComm;
	}
	
	
	
	
	

}
