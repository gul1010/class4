package com.class4;

public class Review {

	public static void main(String[] args) {
		
		
		int num1=10;
		if(num1%5==0) {
			System.out.println("Number is divisible by 5");
		}else {
			if(num1%2==0) {
			   System.out.println("Number is not divisible by 2");
		   }else {
			   
		   }
	}
	
	System.out.println("------------------------------------------------------------------------");
	
	String name="Salma";
	String password="Salma123";
	boolean isAllowed=true;
	double accountBalance=1000;
	double amountToTransfer=3000;
	
	
	if(name.equals("Salma")) {
	     System.out.println("Welcome to Syntax bank");
	}
	if (password.equals("Salma123")) {
		System.out.println("Welcome");
	}
	if (isAllowed) {
		System.out.println("you can transfer money");
	}
	
	System.out.println("--------------------------------------------------------------------------------");
	
	if(name.equals("Salma")){
		if (password.equals("Salma123")) {
			System.out.println("Welcome to the bank");
		}else {
			System.out.println("Incorrect password");
		}
	}else {
		System.out.println("your username is not correct please try again later");
	
	
	}
			
	
	
	
	
	
	
	
	
	
	}
}
