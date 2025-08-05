package com.darshan;

class Animal{
	public void sound() {
		System.out.println("Animal Makes Sound");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("Meow");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Animal obj= new Cat();
		obj.sound();

	}

}
