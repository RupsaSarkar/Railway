package com.railway.passenger.model;

public class PassengerModel {
	private String id;
	private String contactNo;
	private String name;
	private String email;
	private double age;
	private String sex;
	private String address;
	private String password;
	private boolean isActive;
	
	public PassengerModel() {}
	
	public PassengerModel( String id,String contactNo,String name, String email, double age, String sex, String address,
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
		return "PassengerModel [id=" + id + ", contactNo=" + contactNo + ", name=" + name + ", email=" + email
				+ ", age=" + age + ", sex=" + sex + ", address=" + address + ", password=" + password + ", isActive="
				+ isActive + "]";
	}
	
	

}
