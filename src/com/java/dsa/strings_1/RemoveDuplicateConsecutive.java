package com.java.dsa.strings_1;

public class RemoveDuplicateConsecutive {

	public static void main(String[] args) {

		String str = "xxyyzzzxxyy";
		removeConsecutiveDuplicate(str);
	}

	private static void removeConsecutiveDuplicate(String str) {

		char ch = ' ';
		String word = "";
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if ((i + 1) < str.length() && str.charAt(i + 1) != ch) {
				word = word + ch;
				ch = str.charAt(i + 1);
			}

		}
		System.out.println("o/p: " + word);
	}

}
