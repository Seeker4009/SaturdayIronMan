package com.upskill.java_2;

public class Loops {
	/* 	
 	Type of Loops
  		1. For Loop
  		2. While Loop
  		3. Do While Loop
  		4. Infinite Loop
 */
	

	public static void main(String[] args) {
		practiceforLoop();
		//practiceWhileLoop();
		//practiceInfiniteLoop();
		//practiceNestedforLoop();
		
	

		

	}
	
	public static void practiceforLoop(){                                           //for Loop- Do again and again upto upper limit  ( we have lower and upper limit)  (there is a certain limit)
		int i;
		for(i=1; i<=10; i++){                                                       //initialize the variable
			System.out.println("for loops number = " + i);                          //setting lower limit upper limit.increment or decrement
		}                                                                           //statement
	}

	
	public static void practiceWhileLoop(){                                         //While Loop- do again and again upto condition match ( if the condition meets the loop is complete)
		int i = 1;                                                                  //Initialize the variable
		while(i<=10){                                                               //Setting Condition
			System.out.println("While Loop numbers = " + i);
			i++;                                                                  //Statement
		};
	}
	
	

         public static void practiceDoWhileLoop(){                             //Do while Loop - Do action then match condition  (do it first and than match the condition)
	        int i = 1;                                                                // initialize the variable
	        do {
		       System.out.println("Do While loops number = " + i);                   //statement
		       i++;                                                                  //increment or decrement
	        } while (i<=0);                                                          //checking condition
	}
         
        		 
         
         
    public static void practiceInfiniteLoop(){
    	int i;
    	for(i=1;    ; i++){
    		System.out.println("Infinite Loops number = " + i);
    	}
    	
    }
    



public static void practiceNestedforLoop(){
	int i; 
	int  j;
	
	for (i=1; i<=10; i++){
		for (j=1; j<=10; j++){
			int multiplicationTable = i * j;
			System.out.print(multiplicationTable + " |");
		}
		System.out.println("-> ");
			
		}
	}
}
    		
    		
    		
    
