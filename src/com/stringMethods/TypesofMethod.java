package com.stringMethods;

public class TypesofMethod {

public static void main(String[] args) {
	String s="Man of the Match";
	
	int length = s.length();
	System.out.println(length);
	
	boolean equals = s.equals("Man of the Match");
	System.out.println(equals); //case sensitive
	
	boolean equalsIgnoreCase = s.equalsIgnoreCase("man of the Match");
	System.out.println(equalsIgnoreCase); //not a case sensitive
	
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);
	
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	
	boolean startsWith = s.startsWith("Man");
	System.out.println(startsWith); // case sensitive
	
	boolean endsWith = s.endsWith("Match");
	System.out.println(endsWith);
	
	boolean contains = s.contains("Man");
	System.out.println(contains);
	
	int indexOf = s.indexOf("o");
	System.out.println(indexOf);
	
	int lastIndexOf = s.lastIndexOf("t");
	System.out.println(lastIndexOf);
	
	char charAt = s.charAt(4);
	System.out.println(charAt);
	
	String replace = s.replace("of", "why" );
	System.out.println(replace);
	
}
}
