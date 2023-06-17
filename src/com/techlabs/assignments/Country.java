package com.techlabs.assignments;

public class Country {
	String countryAbbreviation, countryName;
	int regId;
	public Country(String countryAbbreviation, String countryName, int regId) {
		super();
		this.countryAbbreviation = countryAbbreviation;
		this.countryName = countryName;
		this.regId = regId;
	}
	public Country() {
		super();
	}
	public String getCountryAbbreviation() {
		return countryAbbreviation;
	}
	public void setCountryAbbreviation(String countryAbbreviation) {
		this.countryAbbreviation = countryAbbreviation;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getRegId() {
		return regId;
	}
	public void setRegId(int regId) {
		this.regId = regId;
	}
	@Override
	public String toString() {
		return "Country [countryAbbreviation=" + countryAbbreviation + ", countryName=" + countryName + ", regId="
				+ regId + "]";
	}
	
}
