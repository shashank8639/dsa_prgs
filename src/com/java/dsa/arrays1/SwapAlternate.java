package com.java.dsa.arrays1;

public class SwapAlternate {

	public static void main(String[] args) {

		int[] arr = {12, 4, 5, 8, 9, 15,13, 19, 21};
		
		swap(arr);
		for(int v: arr)
			System.out.print(v+" ");
	}

	private static void swap(int[] arr) {
		for(int i = 0; i < arr.length-1; i+=2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
	}

}
