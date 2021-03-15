package com.class4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		int i=10;
		String str="Hello";
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter any text");
		
		String text=scan.nextLine();
		
		System.out.println("text that I entered is-"+text);
		
		System.out.println("Please enter your name");
		
		String name=scan.nextLine();
		System.out.println("Nice to meet you "+name);
		
		System.out.println("please enter your age");
		
		int age=scan.nextInt();
		
		System.out.println("my name is "+name+" and I am "+age+" years old");
		
		
		
		
		
		
	}

}
