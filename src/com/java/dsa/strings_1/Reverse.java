package com.java.dsa.strings_1;

public class Reverse {

	public static void main(String[] args) {

		String str = "Words";
		String output = reverse(str);
		System.out.println("reverse: "+output);
	}

	public static String reverse(String str) {

		String reverse = "";
		for(int i=0; i <str.length(); i++) {
			reverse = str.charAt(i)+reverse;
		}
		return reverse;
	}

}
