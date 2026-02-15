package com.java.dsa.arrays1;

public class Sort_0_1 {

	public static void main(String[] args) {

		int[] arr = {1,0,1,1,0,1, 1, 0, 1};
		
		int start = 0, end = arr.length-1;
		while(start < end) {
			if(arr[start] == 1 && arr[end] == 0) {
				arr[start] = 0;
				arr[end] = 1;
				end--;
				start++;
			} else if(arr[end] == 1){
				end--;
			} else if(arr[start] == 0) {
				start++;
			}
		}
		for(int v: arr)
			System.out.print(v+" ");
	}

}
