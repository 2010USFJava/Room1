package com.revature.group;

public class Parent {
	String paName;
	int pAge;

	
	public Parent() {
		
	}

	
	public Parent(String paName,int pAge) {
		this.paName=paName;
		this.pAge=pAge;
		
	}

	public String getPaName() {
		return paName;
	}

	public void setPaName(String paName) {
		this.paName = paName;
	}

	public int getpAge() {
		return pAge;
	}

	@Override
	public String toString() {
		return "Angies Branch";
	}

	
	
	
	
	
}

