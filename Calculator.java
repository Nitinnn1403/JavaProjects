package com.darshan;

class Calculator{
	Calculator(int a,int b) {
		int sum= a+b;
		System.out.println("Addition"+ sum);
	}
	Calculator(int a,int b,boolean multiply){
		int multiplication= a*b;
		System.out.println("Multiplication" + multiplication);
	}
	Calculator(double a,double b){
		double substraction = a-b;
		System.out.println("Subsytraction" + substraction);
	}
//public class Calculator {

	public static void main(String[] args) {
		Calculator obj1= new Calculator(2,5);
		Calculator obj2= new Calculator(23,34,true);
		Calculator obj3= new Calculator(45.2,23.3);
		}
}
