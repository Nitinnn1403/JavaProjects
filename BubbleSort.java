package com.darshan;

public class BubbleSort {

	public static void main(String[] args) {
		int[] numbers= {5,2,4,1,3};
		//Bubble Sort Logic
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=0;j<numbers.length-1;j++) {
	//if number is bigger than next one then swap them
				if(numbers[j]>numbers[j+1]) {
					//swapping
					int temp= numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
			}
		}
		//print the sorted numbers
		System.out.println("Sorted List:");
		for(int num: numbers) {
			System.out.println(num+" ");
		}
	}

}
