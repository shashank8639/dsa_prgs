package com.java.dsa.arrays1;

import java.util.Arrays;

public class FindMinimum {

	public static void main(String[] args) {

		int[] arr = { 12, 5, 18, 22, 16, 3, 18};
		int min = arr[0];
		
		for(int i=1; i < arr.length; i++) {
			if(min > arr[i])
				min = arr[i];
		}
		System.out.println("min: "+min);
		//stream api
		
		int min2 = Arrays.stream(arr)
						 .min()
						 .getAsInt();
		System.out.println("min using stream: "+min2);
	}

}
