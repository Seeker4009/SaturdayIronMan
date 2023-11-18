package com.upskill.java_2;

public class IfElseStatment {

	public static void main(String[] args) {
		int age = 0;
		if (age<= 13){
			if (age <=0){
				System.out.println("You are Invalid");	
			} else
			System.out.println("You are children");
		} else if (age > 13 && age <18){
			System.out.println("Your are a teenager");
		}else if (age >=60){
				if (age >= 100){
				System.out.println ("Your  Champion");
			} else
				System.out.println ("Your  Senior");
				
		} else {
			System.out.println("Your are an adult");
		}

	}

}
