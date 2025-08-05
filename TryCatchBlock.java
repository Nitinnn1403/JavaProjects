package com.darshan;
//Exception Handling Case
public class TryCatchBlock {

	public static void main(String[] args) {
		
		try {
			int x= 2/0;//Exception(problem)
		} catch(ArithmeticException e) {
			System.out.println("You Cannot / by zero");//Providing an alternative
			
		}
		

	}

}
