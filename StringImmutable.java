package com.darshan;

public class StringImmutable {
	String name="Darshan";
		
		public void print() {
			System.out.println(name);
			System.out.println(name.concat(" Jadhav"));
		}
		public static void main(String[] args) {
			StringImmutable obj= new StringImmutable();
			obj.print();
		}

	}


