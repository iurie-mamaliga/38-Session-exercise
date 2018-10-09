package com.techelevator;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class KataRomanNumerals {
	
	public static String romify(int input) {
		
		if(input < 1 || input > 4000) {
			return null;
		}
		String result = "";
		
		Map<String, Integer> romanMap = new LinkedHashMap <String, Integer>();
		romanMap.put("M", 1000);
		romanMap.put("CM", 900);
		romanMap.put("D",  500);
		romanMap.put("CD", 400);
		romanMap.put("C",  100);
		romanMap.put("XC",  90);
		romanMap.put("L",   50);
		romanMap.put("XL",  40);
		romanMap.put("X",   10);
		romanMap.put("IX",   9);
		romanMap.put("V",    5);
		romanMap.put("IV",   4);
		romanMap.put("I",    1);
		
		Set<String> keys = romanMap.keySet();
		
		for(String key : keys) {
			while(input >= romanMap.get(key)) {
				result += key;
				input -= romanMap.get(key);
		
		/*
		 * for(Map.Entry<String, Integer> kv : romanMap.entrySet()) {
		 
			while(input >= kv.getValue()) {
				result += kv.getKey();
				input -= kv.getValue();
				*/
			}
		}
		
		
		return result;
		
		
	}

}
