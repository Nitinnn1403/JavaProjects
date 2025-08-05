package com.darshan;

class Student{
	 private String name;
	 private int age;
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public int getAge() {
		 return age;
	 }
	 public void setAge(int age) {
		 this.age = age;
	 }
	}
public class SimpleEncapsulation {

	public static void main(String[] args) {
		Student obj= new Student();
		obj.setName("Miko");
		obj.setAge(25);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());

	}

}
