package com.darshan;

class Employee{
	private String name;
	private int id;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
public class Task6 {

	public static void main(String[] args) {
		Employee obj= new Employee();
		obj.setName("Darshan");
		obj.setId(20156);
		obj.setSalary(100000000);
		System.out.println(obj.getName());
		System.out.println(obj.getId());
		System.out.println(obj.getSalary());
		

	}

}
