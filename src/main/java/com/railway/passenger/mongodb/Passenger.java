package com.railway.passenger.mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "passenger")
public class Passenger {
	@Id
	private String id;
	@Field
	private String contactNo;
	@Field
	private String name;
	@Field
	private String email;
	@Field
	private double age;
	@Field
	private String sex;
	@Field
	private String address;
	@Field
	private String password;
	@Field
	private boolean isActive;
	
	public Passenger() {}
	
	public Passenger(String id,String contactNo, String name,  String email, double age, String sex, String address,
			String password, boolean isActive) {
		super();
		this.id = id;
		this.contactNo = contactNo;
		this.name = name;
		this.email = email;
		this.age = age;
		this.sex = sex;
		this.address = address;
		this.password = password;
		this.isActive = isActive;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
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

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", contactNo=" + contactNo + ", name=" + name + ", email=" + email + ", age="
				+ age + ", sex=" + sex + ", address=" + address + ", password=" + password + ", isActive=" + isActive
				+ "]";
	}
	
	

}
