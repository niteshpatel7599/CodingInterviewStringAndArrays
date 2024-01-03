package com.arrays_string.exercises;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicateInString {

	public static void main(String[] args) {
		String str ="acsdfggllhhlkkkkooopp";
		char[] c = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<>();
		for (char d : c) {
			charMap.put(d, charMap.getOrDefault(d, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry: charMap.entrySet()) {
//			if(entry.getValue() == 1) {
//				System.out.print(entry.getKey());}
//			System.out.println();
			if (entry.getValue() != 1) {
				System.out.print(entry.getKey());
			}
		}
		
	}
}
