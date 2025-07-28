package PracticePrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

	public static void main(String[] args) {
		
		 String input = "Programming";
	        input = input.toLowerCase(); // optional: ignore case

	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Count occurrences
	        for (char ch : input.toCharArray()) {
	            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	        }

	        // Print duplicates
	        System.out.println("Duplicate characters:");
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " → " + entry.getValue());
	            }
	        }
	    }
	
	

}
