package com.class4;

public class NestedIf {

	public static void main(String[] args) {

		boolean morning = true;
		boolean classToday = true;

		// is it morning?--> Good morning
		// if there is a class: yes--> hello classmate
		// otherwise--> hello my family

		if (morning) {

			System.out.println("let me check if i have class today");

			if (classToday) {

				System.out.println("Good morning class");

			} else {
				System.out.println("Good morning my family");
			}

		}
		System.out.println("----------------------------------------------------");

		boolean morning1 = true;
		boolean classToday1 = false;

		// is it morning?--> Good morning
		// if there is a class: yes--> hello classmate
		// otherwise--> hello my family

		if (morning1) {

			System.out.println("let me check if i have class today");

			if (classToday1) {

				System.out.println("Good morning class");

			} else {
				System.out.println("Good morning my family");
			}

		}
		System.out.println("-----End of the code-----------");

		System.out.println("--------------------------------------------------------------------");

		boolean anyAllergy = true;

		boolean pollenAllergy = true;

		if (anyAllergy) {
			System.out.println("Lets check which allergy you have");
			if (pollenAllergy) {
				System.out.println("dont get too close to trees");

			} else {
				System.out.println("I know you dont have");
			}
		} else {
			System.out.println("You are lucky");
		}
		System.out.println("--------------------------------------------------------------------");

		/*
		 * if it is friday--> go to movie, otherwise stay at home and study if it is
		 * friday then i will check if date is 13--> if yes--> watch scary movies if
		 * no--> watch any movie
		 */

		boolean isFriday = false;

		int day = 14;

		if (isFriday) {
			System.out.println("it is a movie day");
			if (day == 13) {
				System.out.println("I will watch scary movie");
			} else {
				System.out.println("i will watch any movie");

			}
		} else {
			System.out.println("I will stay at home and study");

		}

		System.out.println("-------------------------------------------------------------------------");

		/*
		 * check assignment based on the score we display a message
		 * 
		 * 
		 */

		boolean completed = true;
		int score = 90;

		if (completed) {

			if (score > 90) {
				System.out.println("Great job");
			} else if (score > 80) {
				System.out.println("good job");
			} else if (score > 70) {
				System.out.println("good but try better");
			} else {
				System.out.println("good for tying, study more");
			}

		} else {
			System.out.println("please make sure to complete all");
		}

		System.out.println("--------------------------------------------------------------------------------");

		boolean mor = false; // if it is morning, i will go work otherwise i will check if i have class. if
								// yes, i will attend class otherwise i can relax
		boolean clToday = true;

		if (mor) {
			System.out.println("Im going to work");
		} else {
			System.out.println("let me check if i have a class today");
			if (clToday) {
				System.out.println("I will attend class at Syntax");
			} else {
				System.out.println("I can relax");

			}
		}
		
		
		System.out.println("----------------------------------------------------------------------------------");
		
		boolean diploma=true;
		double gpa=3.7;
		
		if(diploma) {
			System.out.println("Congratulations");
			if(gpa>3.5) {
				System.out.println("You are eligible for scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
		}else {
			System.out.println("we suggest you to get a degree");
			
		}
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		double rate=4.00;
		int price=2700000;
		
		if(rate>4.5) {
			System.out.println("Will not buy a house");
			
		}else {
			System.out.println("he will consider it buying");
			if (price>2000000) {
				System.out.println("user will take loan");
			}else {
				System.out.println("will pay cash");
			}
		}
		 System.out.println("------------------------------------------------------------------------------------");
		 
		 int age=20;
	     int weight=115;
	     
	     if (age>=18) {
	    	 System.out.println("you can donate");
	    	 if (weight>110) {
	    		 System.out.println("for donating");
	    	 }else {
	    		 System.out.println("for not donating");
	    	 }
	     }else {
	    	 System.out.println("you cannot donate");
	    	 
	     }
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	

}
