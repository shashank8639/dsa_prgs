package com.java.dsa.strings_1;

public class ReverseEachWord {

	public static void main(String[] args) {

		String phrase="Hello, I'm a Trainer";
		String words[] = phrase.split(" ");
		String reverse = "";
		for(String s: words) {
			reverse += Reverse.reverse(s)+" ";
		}
		System.out.println("phrase reverse: "+reverse);
	}

}
