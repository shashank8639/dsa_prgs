package com.java_dsa.practice_programs.arrays;

//FindMaxElement.java in practice branch
public class FindMaxElement {
 public static void main(String[] args) {
     int[] numbers = {10, 45, 23, 89, 12, 67};
     int max = findMax(numbers);
     System.out.println("Maximum element: " + max);
     System.out.println("Index of max: " + findMaxIndex(numbers));
 }
 
 public static int findMax(int[] arr) {
     // Enhanced with error handling
     if(arr == null || arr.length == 0) {
         throw new IllegalArgumentException("Array is empty");
     }
     int max = arr[0];
     for(int num : arr) {
         if(num > max) max = num;
     }
     return max;
 }
 
 public static int findMaxIndex(int[] arr) {
     int maxIndex = 0;
     for(int i = 1; i < arr.length; i++) {
         if(arr[i] > arr[maxIndex]) {
             maxIndex = i;
         }
     }
     return maxIndex;
 }
}
