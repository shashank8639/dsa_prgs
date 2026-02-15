package com.java.dsa.strings_1;

public class Palindrome {

	public static void main(String[] args) {

		String str = "MADAME";
		String output = Reverse.reverse(str);
		if(output.equals(str)) {
			System.out.println("Given "+str+" is palindrome");
		} else {
			System.out.println("Given "+str+" is not a palindrome");
		}
	}

}
