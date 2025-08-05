package com.darshan;

class print{
	public String InkJetPrinter(String IJP) {
		return IJP;
	}
	public String LaserPrinter(String LP) {
		return LP;
	}
}
public class Printer {
	public static void main(String[] args) {
		print obj=new print();
		System.out.println(obj.InkJetPrinter("Hello InkJetPrinter"));
		System.out.println(obj.LaserPrinter("Hello LaserPrinter"));
	

	}

}
