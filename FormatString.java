package com.stringclass;

public class FormatString {

	public static void main(String[] args) {
		// %s specifier indicates a string will be inserted into the string.
		String greetingTemplate = "Hello, dear %s! Good %s!";
		
		String name = "Bob Ross";
		String morning = "morning";
		String afternoon = "afternoon";
		String evening = "evening";
		String formattedString = String.format(greetingTemplate, name, morning);
		
		System.out.println("String.format method signature (FormatStringObj, args...");
		System.out.println(formattedString);
		System.out.println();
		System.out.println("System.out.printf to format during output to console.");
		System.out.printf("Print digit here '%d'", 10);

	}

}
