package com.java.dsa.arrays1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {

		int[] arr = { 12, 5, 18, 22, 16, 18};
		
		for(int i= 0; i < arr.length; i++) {
			int count = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j] && i != j) {
					count++;
					break;
				}
			}
			if(count > 0) {
				System.out.println(arr[i]);
				break;
			}
		}
		
		//using Stream api
		Set<Integer> seen = new HashSet<Integer>();
		int result = Arrays.stream(arr)
									.filter(num -> !seen.add(num))
									.findFirst()
									.orElse(-1);
		System.out.println("result: "+result);
	}

}
