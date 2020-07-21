package com.stringclass;
import java.util.Arrays;

public class StringComparison {

	public static void main(String[] args) {
		System.out.println(" ===== Comparing Strings ===== ");
		System.out.println();
		
		String s = " tenletters ";
		String s2 = " tenletters ";
		String s3 = new String(" tenletters ");

		System.out.println("When the variables are created with the same values, "
				+ "\nthe new variable will be passed a reference to the existing object in memory.");
		System.out.println("String s  = \" tenletters \";");
		System.out.println("String s2 = \" tenletters \";");
		System.out.println("s:  " + s);
		System.out.println("s2: " + s2);
		System.out.println("s == s2: " + (s == s2));
		
		System.out.println();
		System.out.println("The prior evaluation indicates the s and s2 reference the same object.");
		System.out.println("...the String object is in the String Pool in the heap.");
		
		System.out.println();
		System.out.println("the 'new String(...)' syntax creates a new String object regardless of the String Pool.");
		System.out.println("String s3 = new String(\" tenletters \");");
		System.out.println("s3: " + s3);
		System.out.println();
		
		System.out.println("s == s3: " + (s == s3));
		
		System.out.println();
		System.out.println("s.equals(s3): " + s.equals(s3));
		System.out.println("s == s3.intern(): " + (s == s3.intern()));
		
		System.out.println();
		String name1 = "Curt G";
		String name2 = "curt g";
		System.out.println("name1: " + name1);
		System.out.println("name2: " + name2);
		System.out.println("Object methods .equals vs .equalsIgnoreCase");
		System.out.println("  name1.equals(name2): " + name1.equals(name2));
		System.out.println("  name1.equalsIgnoreCase(name2): " + name1.equalsIgnoreCase(name2));
	}

}
