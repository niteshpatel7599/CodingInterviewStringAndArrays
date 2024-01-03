package com.arrays_string.exercises;

import java.util.HashMap;
import java.util.Map;

public class FindingTheFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String str = "aabbccddeeffgghhkkollmmnn";
		char[] c = str.toCharArray();
		Map<Character, Integer> mapStr = new HashMap<>();
		for (char d : c) {
			mapStr.put(d, mapStr.getOrDefault(d, 0)+1);
		}
		for(Map.Entry<Character,Integer> entry: mapStr.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println("First Non-Repeated Character  : " + entry.getKey());
			}
		}
	}
}
