package com.collections;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		
		Set<Integer> s=new HashSet<Integer>();
		s.add(2);
		s.add(10);
		s.add(20);
		// System.out.println(s);
		
		// s.remove(10);
		// System.out.println(s);
		
		
		// int size=s.size();
		// System.out.println(size);
		
	//	boolean contains = s.contains(100);
		
	//	System.out.println(contains);
		
		s.retainAll(2);
		System.out.println(s);
		
		
		
		
		
		
		
		
	}
	
}
