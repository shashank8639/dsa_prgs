package com.java.dsa.arrays1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindUnique {

	public static void main(String[] args) {

		int[] arr = { 12, 3, 22, 12, 16, 5, 18, 22, 16, 3, 18, 1};
		int unique = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j] && i != j) {
					count++;
					break;
				} 
			}
			if(count == 0) {
				unique = arr[i];
				break;
			}
		}
		System.out.println("unique value: "+unique);
		
		//using stream api
		List<Integer> list = Arrays.stream(arr)
								.boxed()
								.collect(Collectors.toList());
		
		int result = list.stream()
						 .filter(num -> Collections.frequency(list, num) == 1)
						 .findFirst()
						 .orElse(-1);
		System.out.println("Stream api unique: "+result);
	}

}
