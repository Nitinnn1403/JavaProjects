package com.darshan;
public class Task5 {

	public static void main(String[] args) {
		int [] numbers= {2,5,6,9,10};
		int sum=0;
		for(int i=1;i<11;i++)
			System.out.println(i);
		for(int num: numbers) {
			if(num%2==0) {
				System.out.println(num);
			}
		}
		for(int num: numbers) {
			sum+=num;
		}
		System.out.println("The Sum Of Numbers Is:"+sum);
		
		int []arr= {12,13,34,56,78};
		int large=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>large) {
				large=arr[i];
			}
		}
		System.out.println(large);
		
		int[]arr1= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int count=0;
		
		for(int num:arr1) {
			if(num%2 !=0) {
				count++;
			}
		}
		System.out.println("Total Odd Numbers In an Array Is:"+ count);
		
		
		int arr2[]= {23,34,56,67,78,89};
		for(int i=arr2.length-1;i>=0;i--) {
			System.out.println(arr2[i]);
		}
		
	}

}
