package com.upskill.java_1;

public class MethodType {
	
	
	

	/*Types of Method
	1.Void method
	2.Static method
	3.Return Type methode
	
	*/
	
	
	public static int hourlyIncome = 65;          // static variable

	public static void main(String[] args) {      // main method
		
		MethodType obj = new MethodType();        // Object variable
		obj.annualIncomeVoid();
		
		System.out.println ("My monthly Income = " + obj.monthlyIncomeReturn());
		
		
		weeklyIncomeStatic();
			
		
	}
	//Void method
	public void annualIncomeVoid(){
	   int calculateAnnualIncom = hourlyIncome * 2000;
	   System.out.println ("My Annual Income = " + calculateAnnualIncom);
		
      }
	
	// Return Type method
	
	public int monthlyIncomeReturn() {
		int calculateMonthlyIncom = hourlyIncome *180;
		return calculateMonthlyIncom;
		
	}
	
	// Static method
	
	public static void weeklyIncomeStatic()
	{
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My weekly Income = " + calculateWeeklyIncome);
		
		
	}	
	}   