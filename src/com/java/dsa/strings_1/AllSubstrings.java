package com.java.dsa.strings_1;

public class AllSubstrings {

	public static void main(String[] args) {

		String str = "abcde";
		printAllSubStrings(str);
		System.out.println("=============");
		printAllSubstringsAlt(str);
	}

	private static void printAllSubstringsAlt(String str) {

		int len = str.length();
		for(int i=0; i < len; i++) {
			String word = str.substring(i, len);
			StringBuffer sb = new StringBuffer();
			for(int j=0; j < word.length(); j++) {
				char ch = word.charAt(j);
				sb.append(ch);
				System.out.println(sb);
			}
		}
	}

	private static void printAllSubStrings(String str) {

		int len = str.length();
		for(int i=0; i < len; i++) {
			for(int j = i+1; j <= len; j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

}
