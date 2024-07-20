package com.Exceptions;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.TreeMap;

public class ExceptioHandling {

	public static void main(String[] args) {
		// int a=10;
		
		Map<String, Integer> s=new TreeMap<String, Integer>();
		
		
		
		try {
			
			s.put("Hi", null);
			
			System.out.println(s);
			
		} catch (InputMismatchException e) {
			System.out.println("True");
		}
	}
}
