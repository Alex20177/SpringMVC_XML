package com.example;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	private String firstName;
	
	@NotNull(message="Is required")
	@Size(min=1,message="Is required")
	private String lastName;
	
	private String country;
	private LinkedHashMap<String, String>countryOptions;
	private String operatingSystem[];
	private String language;
	
	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("BRA", "Brazil");
		countryOptions.put("FRA", "Francia");
		countryOptions.put("MEX", "Mexico");
		countryOptions.put("IND", "India");
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
}//Close Student Class
