package com.upskill.assignment2;
/*Write two java functions which will return two different integer values, write a 
     program to compare those numbers and send message that one number is bigger 
     than other. (hints: using if..else) */




public class NumberComparision {

	
	
		public static void main(String[] args) {  //The main method compares these 2 numbers and prints a message indicating which one is bigger or if they are equal
	        int number1 = getNumber1();           // This (getNumber1()) is call function i (user define) provided to return the value
	        int number2 = getNumber2();
	        
	        if (number1 > number2) {
	            System.out.println("Number 1 is bigger than Number 2.");
	        } else if (number1 < number2) {
	            System.out.println("Number 2 is bigger than Number 1.");
	        } else {
	            System.out.println("Number 1 and Number 2 are equal.");
	        }
	    }

	   
	    public static int getNumber1() {    // Function to return the first integer value
	        return 10;                      //the getNumber1() function returns the integer 10
	    }
	    
	    public static int getNumber2(){
	    	return 20;
	    }
}

	    
	        // Function to return the second integer value
	                           // and the getNumber2() function returns the integer 20
	
	




