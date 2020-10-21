package com.revature.driver;

import com.revature.group.Child;
import com.revature.group.Parent;

public class Driver {

	public static void main(String[] args) {
	
		Parent parent1 = new Parent("sally", 30);
		System.out.println(parent1);
		
		Parent parent2= new Parent("danny", 25);
		System.out.println(parent2);
		
		Child child1 = new Child("kloe", 1);
		System.out.println(child1);
		
		Child child2 = new Child("doug", 5);
		System.out.println(child2);
		
		
		}
	

}
