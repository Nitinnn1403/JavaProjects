package com.darshan;

import java.util.Scanner;

public class Input_Java {
	public static void main(String[] args) {
		
		Scanner obj= new Scanner (System.in);
		System.out.println("Enter Your Name:");
		
		String Name= obj.nextLine();
			
		System.out.println("Enter Your Age:");
		int age=obj.nextInt();
		obj.close();
		System.out.println("Your Name Is:"+ Name);
		System.out.println("Your Age Is:"+ age);
			
		
	}

}
