package com.cdp.address.models;

public class GetAddressDetailsResponse {

	public String street;
	public String city;
	public String houseNo;
	public String country;

	public GetAddressDetailsResponse(String street, String city, String houseNo, String country, String zipCode) {
		super();
		this.street = street;
		this.city = city;
		this.houseNo = houseNo;
		this.country = country;
		this.zipCode = zipCode;
	}

	public String zipCode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
