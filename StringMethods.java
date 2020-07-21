package com.stringclass;
import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		System.out.println(" ===== String Methods ===== ");
		System.out.println();
		
		String s = " tenletters ";
		
		System.out.println("String s = \" tenletters \";");
		System.out.println("s: " + s);
		System.out.println();
		System.out.println("s.contains(\"let\"): " + s.contains("let"));
		System.out.println("s.isEmpty(): " + s.isEmpty());
		System.out.println("s.toUpperCase(): " + s.toUpperCase());
		System.out.println("s.startsWith(\"l\"): " + s.startsWith("l"));
		System.out.println("s.endsWith(\" \"): " + s.endsWith(" "));
		System.out.println("s.replace(\"tt\", \"TT\")): " + s.replace("tt", "TT"));
		System.out.println("s.trim(): " + s.trim());
		System.out.println("s.strip(): " + s.strip());
		System.out.println("s.substring(3,8): " + s.substring(3,8));
		System.out.println();
		System.out.println("String: .getBytes, .toChar and .split return arrays.");
		System.out.println("   'Arrays.toString' is used to display in the console.");
		System.out.println("Arrays.toString(s.getBytes()): " + Arrays.toString(s.getBytes())); // String.getBytes outputs an array of bytes
		System.out.println("Arrays.toString(s.toCharArray()): " + Arrays.toString(s.toCharArray()));
		System.out.println("Arrays.toString(s.split(\"e\")): " +Arrays.toString(s.split("e")));
		System.out.println();
		System.out.println("s.charAt(5): " + s.charAt(5));
		System.out.println();
	}

}
