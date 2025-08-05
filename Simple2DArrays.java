package com.darshan;

public class Simple2DArrays {

	public static void main(String[] args) {
		String[][] chocolateBox= {
				{"Ball 1","Ball 2","Ball 3"},
				{"Ball 4","Ball 5","Ball 6"},
				{"Ball 7","Ball 8","Ball 9"}
				
		};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(chocolateBox[i][j]+" ");
			}
		System.out.println();
		}
	}

}
