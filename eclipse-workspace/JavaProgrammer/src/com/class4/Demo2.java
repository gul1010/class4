package com.class4;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		/*
		 * Capture 2 numbers from a user and then we will compare them.
		 */
	
	    Scanner input=new Scanner(System.in);
	    
	    System.out.println("Please enter first number");
	    
	    int num=input.nextInt();
	    
	    System.out.println("Please enter second number");
	    
	    int num1=input.nextInt();
	    
	    if (num>num1) {
	    	System.out.println(num+" is larger than "+num1);
	    }else if (num<num1) {
	    	System.out.println(num1+" is larger than "+num);
	    }else {
	    	System.out.println(num+" is equal to "+num1);
	    }
	
	
	
	}

}
