package com.darshan;
 import java.util.LinkedList;
 import java.util.Scanner;
 import java.util.HashSet;
public class Task2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashSet<String> fruitset=new HashSet<String>();
		LinkedList<String> fruitlist=new LinkedList<String>();
		
		
		System.out.println("Enter 5 Fruits");
		for(int i=0;i<5;i++) {
			String fruit = sc.nextLine();
			if(!fruitset.contains(fruit)) 
			{
				fruitset.add (fruit);
				fruitlist.add(fruit);
			}
		}
		System.out.println("Fruits in basket" + fruitlist);
		System.out.println("Fruit Count"+ fruitlist.size());
		
		
		
	}

}
