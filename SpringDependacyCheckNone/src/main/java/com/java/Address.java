package com.java;

public class Address {
	private String addressLine;

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + "]";
	}
	

}
