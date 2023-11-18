package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		int age = 30;
		int[] ageIronMan = new int[]{25, 32, 37, 21, 27};
		
		//Array index [0} [1] [2] [3] [4]
		
		System.out.println("Student age : ' + ageIronMan[2]");
		System.out.println("Total Student : ' " + ageIronMan.length);
		
		
		
		String[] NameIronMan = new String[]{"Yusuf", "Saiful", "Fahim", "Tariq", "Foyaz"};
		
		//Array index [0} [1] [2] [3] [4]
		
		System.out.println("Student name : " + NameIronMan[2]);
		System.out.println("Total Student : ' " + NameIronMan.length);
		
		//multi-Dimensional Array
		int[][] ageIronMan2D = {{25, 32, 37, 21, 27, 32},                           // [0][0] [0][1] [0][2] [0][3] [0][04] [0][5]
				                {26, 30, 33, 28}};                                  // [1][0] [1][1] [1][2] [1][3]
		System.out.println("Student Age 2D : " +  ageIronMan2D[1][0]);
		
		//Hashmap store multiple data using key-value pair, Implementation of map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Yusuf",  28);
		Student.put("Abdullah",  22);
		Student.put("Madan",  32);
		Student.put("Jannatul",  24);
		Student.put("Fahim",  24);
		
		
		System.out.println("Hashmap Student Age : " + Student.get("Madan"));
		
		HashMap<String, String> Country = new HashMap<String, String>();
		Country.put("USA",  "Washington DC");
		Country.put("Bangladesh",  "Dhaka");
		Country.put("Hawaii",  "Honolulu");
		Country.put("Cuba",  "Havana");
		Country.put("Brazil",  "Brasillia");
		
		
		System.out.println("Hashmap Country Capital : " + Country.get("Hawaii"));
		
		//Hashset store unordered collection containing unique value, implementation of set interface
		
		HashSet<String> car = new HashSet<String>();
		car.add("BMW");
		car.add("Toyota");
		car.add("Tesla");
		car.add("Audi");
		System.out.println("Car : " + car);
		
		
		//HashTable store multiple data using key value pair, no duplicates
	    //Also is synchronized  (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		System.out.println("Region : " + Region.get("BD"));
		
	}
}

