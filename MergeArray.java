package com.darshan;

public class MergeArray {

	public static void main(String[] args) {
		//We took Two Array
		int[] a= {1,2};
		int[] b= {3,4};
		//Then Create New Array with Size
		int[] merge=new int[a.length + b.length];
		//Then Copy First Array Into The Merged Array
		for(int i=0;i<a.length;i++) {
			merge[i] = a[i];
		}
		//Then Copy Second Array Into The Merged Array
		for(int i=0;i<b.length;i++) {
			merge[i+a.length]= b[i];
		}
		//Then Print The Merged Array
		for( int i=0;i<merge.length;i++) {
			System.out.println(merge[i]);
			
		}
		

	}

}
