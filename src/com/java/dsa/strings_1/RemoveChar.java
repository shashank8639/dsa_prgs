package com.java.dsa.strings_1;

public class RemoveChar {

	public static void main(String[] args) {

		String str = "aaxxyyabbxxddcxd";
		char ch = 'x';
		removeChar(str, ch);
	}

	private static void removeChar(String str, char ch) {

		StringBuffer sb = new StringBuffer();
		for(int i = 0; i <str.length(); i++) {
			if(str.charAt(i) != ch)
				sb.append(str.charAt(i));
		}
		System.out.println(sb);
	}

}
