package com.class4;

public class Confusion {

	public static void main(String[] args) {
		
		String name="Salma";
		String password="Salma123";
		boolean isAllowed=true;
		double accountBalance=1000;
		double ammountToTransfer=3000;
		
		if(name.equals("Salma")){
			if (password.equals("Salma123")) {
				System.out.println("Welcome to the bank");
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
