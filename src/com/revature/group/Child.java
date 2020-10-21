package com.revature.group;

public class Child {
	String chName;
	int cAge;
	
	
	public Child() {
		
	}
	
	public Child(String chName, int cAge) {
		this.chName=chName;
		this.cAge=cAge;
		
	}

	public String getChName() {
		return chName;
	}

	public void setChName(String chName) {
		this.chName = chName;
	}

	public int getcAge() {
		return cAge;
	}

	public void setcAge(int cAge) {
		this.cAge = cAge;
	}

	@Override
	public String toString() {
		return "Angies Branch";
	}

	
	
}
