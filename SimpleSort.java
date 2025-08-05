package com.darshan;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleSort {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(5);
		numbers.add(20);
		numbers.add(15);
		
		System.out.println("Before sort"+ numbers);
		Collections.sort(numbers);//Ascending Order
		System.out.println("After Sort"+ numbers);
		Collections.reverse(numbers);	
		
	}

}
