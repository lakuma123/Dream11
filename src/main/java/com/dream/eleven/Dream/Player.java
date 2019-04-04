package com.dream.eleven.Dream;


public class Player {
	
	private String number;
	private String name;
	private String credits;
	private String type;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCredits() {
		return credits;
	}
	public void setCredits(String credits) {
		this.credits = credits;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Player [number=" + number + ", name=" + name + ", credits=" + credits + ", type=" + type + "]";
	}
	
	

}
