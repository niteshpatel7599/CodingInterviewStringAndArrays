package com.arrays_string.exercises;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicateInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,4,5,6,6,7,8};
		String[] str= {"Nitesh", "Nitesh", "Anup", "Anup"};

		Map<String, Integer> strMapEntry = new HashMap<>();
		for (String string : str) {
			strMapEntry.put(string, strMapEntry.getOrDefault(string, 0)+1);
		}
		Map<Integer, Integer> mapEntry = new HashMap<>();
		for (int i : arr) {
			mapEntry.put(i, mapEntry.getOrDefault(i, 0) +1);
		}
		for(Map.Entry<String, Integer> entry1: strMapEntry.entrySet()) {
			System.out.println("String :"+ entry1.getKey() + "Count :" + entry1.getValue());
		}
		for(Map.Entry<Integer, Integer> entry:mapEntry.entrySet()) {
			System.out.println("Integer :"+ entry.getKey() + "Count :" + entry.getValue());
		}
}
}
