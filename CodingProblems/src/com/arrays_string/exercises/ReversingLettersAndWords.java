package com.arrays_string.exercises;

public class ReversingLettersAndWords {

	public static void main(String[] args) {
		String s = "Hello World Java Programming";
		ReversingLettersAndWords rev = new ReversingLettersAndWords();
		System.out.print("Reversed Letter : "+ rev.reverseLetter(s));
		System.out.println();
		System.out.print("Reversed Words : "+ rev.reverseWords(s));
	}
	
	public String reverseLetter(String str) {
		char c[] = str.toCharArray();
		int start =0;
		int end = c.length-1;
		while(start<end) {
			char temp = c[start];
			c[start] =c[end];
			c[end] = temp;
			start++;
			end--;
		}
		return new String(c);
	}
	
	public String reverseWords(String str) {
		String[] words = str.split("\\s+");
		StringBuilder strBuilder = new StringBuilder();
		for (int i = words.length -1; i>=0; i--) {
			strBuilder.append(words[i]).append(" ");
		}
		return strBuilder.toString().trim();
	}
}
