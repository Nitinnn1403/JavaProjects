package com.darshan;

class parent{
	void car() {
		System.out.println("BMW");
	}
}
class Son extends parent{
	void car() {
		System.out.println("G-Wagon");
		super.car();
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		Son obj=new Son();
		obj.car();
		
	}

}
