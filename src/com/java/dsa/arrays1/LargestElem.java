package com.java.dsa.arrays1;

import java.util.Arrays;

public class LargestElem {

	public static void main(String[] args) {

		int[] arr = { 12, 5, 18, 22, 16, 3, 18};
		
		int max =arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println("max: "+max);
		
		// Stream approach
		int max2 = Arrays.stream(arr)
									.max()
									.getAsInt();
		System.out.println("max using stream: "+max2);
	}

}
