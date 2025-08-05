package com.darshan;
public class Task4 {
	public static void main(String[] args) {
		String name = "Darshan";
		String name1 = ("I Love Java Programming");
		System.out.println(name.toUpperCase());
		System.out.println(name1.contains("Java"));
		System.out.println(name1.length());
		
		StringBuilder obj= new StringBuilder("Good");
		obj.append(" Morning");
		System.out.println(obj);
		
		StringBuffer sc= new StringBuffer("Coding");
		sc.append(" Is");
		sc.append(" Fun");
		System.out.println(sc);
		}
	}
