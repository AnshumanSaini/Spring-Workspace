package com.hughes.model;

public class Aadhar {

	private int aadhar_no;
	private String name;
	private String mobile_no;
	private String address;
	private int income;
	private String state;

	public Aadhar() {

	}
	
	public Aadhar(int aadhar_no, String name, String mobile_no, String address, int income, String state) {
		this.aadhar_no=aadhar_no;
		this.name=name;
		this.mobile_no=mobile_no;
		this.address=address;
		this.income=income;
		this.state=state;
	}

	public int getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(int aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
