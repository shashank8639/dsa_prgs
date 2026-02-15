package com.java.dsa.arrays1;

public class ReturnArrSum {

	public static void main(String[] args) {

		int[] arr = {12, 3, 4, 5};
		
		int sum = arrSum(arr);
		System.out.println("Total sum: "+sum);
	}

	private static int arrSum(int[] arr) {
		int sum = 0;
		for(int v: arr)
			sum += v;
		return sum;
	}

}
