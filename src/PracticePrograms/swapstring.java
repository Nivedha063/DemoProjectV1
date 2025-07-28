package PracticePrograms;

public class swapstring {

	public static void main(String[] args) {
	
		
		String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before Swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // Step 1: Concatenate str1 and str2
        str1 = str1 + str2;

        // Step 2: Extract original str1
        str2 = str1.substring(0, str1.length() - str2.length());

        // Step 3: Extract original str2
        str1 = str1.substring(str2.length());

        System.out.println("\nAfter Swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }

	}


