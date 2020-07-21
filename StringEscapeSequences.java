package com.stringclass;

public class StringEscapeSequences {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("Escape sequences");
		System.out.println("\t\\t - tab."
				+ "\n\t\\b - backspace.\n\t\\n - new line."
				+ "\n\t\\r - carriage return."
				+ "\n\t\\f - form feed.\n\t\\' single quote."
				+ "\n\t\\\" double quote.\n\t\\\\ backslash.");

		System.out.println();
		System.out.println("Escape to Unicode from String");
		System.out.println("\t\\u###### - U + Hexidecimal Value");
		System.out.println("\t\\u2623 \u2623 ");
		System.out.println("\t\\u2743 \u2743 ");
		System.out.println("\t\\u2764 \u2764 ");
		System.out.println("\t\\u2791 \u2791 ");
		System.out.println("\t\\u2604 \u2604 ");
		System.out.println("\t\\u263a \u263a ");
		System.out.println("\t\\u263b \u263b ");
		System.out.println("\t\\u262e \u262e ");
		
	}

}
