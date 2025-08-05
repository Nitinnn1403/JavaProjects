package com.darshan;

import java.util.ArrayList;
import java.util.Collections;

public class StringSort{

	public static void main(String[] args) {
		ArrayList<String> numbers=new ArrayList<String>();
		numbers.add("Darshan");
		numbers.add("Vikas");
		numbers.add("Lalit");
		numbers.add("Rajesh");
		
		System.out.println("Before sort"+ numbers);
		Collections.sort(numbers);//Ascending Order
		System.out.println("After Sort"+ numbers);
		Collections.reverse(numbers);	
		
	}

}
