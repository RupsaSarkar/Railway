package com.railway.passenger.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "passenger")
public class Passenger {
	
	private String Name;
	private String ContactNo;
	private String Email;
	private double Age;
	private String Sex;
	private String Address;
	private String Password;
	//private boolean IsActive;

	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public double getAge() {
		return Age;
	}
	public void setAge(double age) {
		Age = age;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	//public boolean isIsActive() {
		//return IsActive;
	//}
	//public void setIsActive(boolean isActive) {
		//IsActive = isActive;
	//}
	@Override
	public String toString() {
		return "Passenger [Name=" + Name + ", ContactNo=" + ContactNo + ", Email=" + Email + ", Age=" + Age + ", Sex="
				+ Sex + ", Address=" + Address + ", Password=" + Password + "]";
	}



}
