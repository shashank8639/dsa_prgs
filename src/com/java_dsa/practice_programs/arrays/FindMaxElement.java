package com.java_dsa.practice_programs.arrays;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] numbers = {10, 45, 23, 89, 12, 67};
        int max = findMax(numbers);
        System.out.println("Maximum element: " + max);
    }
    
    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }
}

