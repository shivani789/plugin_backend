package com.slb.models;

public class Error {
	int code;
	String description;
	
	public Error(int code, String description) {
		this.code = code;
		this.description = description;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "StarterError [code=" + code + ", description=" + description + "]";
	}
}