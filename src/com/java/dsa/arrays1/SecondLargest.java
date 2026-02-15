package com.java.dsa.arrays1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondLargest {

	public static void main(String[] args) {

		int[] arr = { 12, 5, 18, 22, 16, 3, 18, 21, 25, 24};
		int max1 = arr[0];
		int max2 = max1;
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			} else if(arr[i] > max2) {
				max2 = arr[i];
			}
		}
		System.out.println("Second largest: "+max2);
		//using stream
		
		Optional<Integer> secLargest = Arrays.stream(arr)
								.boxed()
								.distinct()
								.sorted(Comparator.reverseOrder())
								.skip(1)
								.findFirst();
		System.out.println("Second largest: "+secLargest.get());
	}

}
