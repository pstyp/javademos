package com.qa.demo;

public class MultiDimensionalArrayExample {

	public static void main(String[] args) {
		
		int[][] ageArray = {{25, 30, 21}, {56, 67, 39}, {8, 1, 2} }; // new int[3][3]
		String[][] nameArray = new String[3][2];
		nameArray[1][1] = "John";
		nameArray[0][0] = "Jordan";
		
		// FOR-EACH LOOPS (ENHANCED FOR LOOPS)
		
		for (int[] a : ageArray) {
			for (int b : a) {
				System.out.println(b);
			}
		}
		// FOR LOOP
		
		for (int i =0; i<ageArray.length; i++) {
			for (int j=0; j<ageArray[i].length; j++) {
				System.out.println(ageArray[i][j]);
			}
		}
	}
	
}
