package com.class4;

import java.util.Scanner;

public class Scanreview {

	public static void main(String[] args) {
		
		String name;
		String password;
		boolean isAllowed=true;
		System.out.println("Please enter your name");
		Scanner scanner=new Scanner(System.in);
		name=scanner.next();
		System.out.println("Please enter your password");
		password=scanner.next();
		
		
		
		
		double accountBalance=1000;
		double ammountToTransfer=300;
		
		if(name.equals("Salma")){
			if (password.equals("Salma123")) {
				System.out.println("Welcome to the bank");
				System.out.println("Please enter the amount to transfer");
				ammountToTransfer=scanner.nextDouble();
				if (accountBalance>=ammountToTransfer) {
				   System.out.println("Amount transferred");	
				}else {
				System.out.println("Insufficent balance");
				
			   }
		    }else {
			System.out.println("incorrect password");	
		    }
			
		}else {
			System.out.println("your username is not correct please try again later");
		    }
	      }
       

	}


