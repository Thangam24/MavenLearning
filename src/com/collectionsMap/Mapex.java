package com.collectionsMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Mapex {

	
	public static void main(String[] args) {
		
		
//		Map<Integer, String> s=new HashMap<Integer, String>();
//		s.put(100, "Doll");
//		s.put(200, "Ball");
//		s.put(300, "Nil");
//		s.put(500, "Doll");
//		s.put(700, "Doll");
		
		
//		Map<String, Integer> d=new Hashtable<String, Integer>();
//		d.put("ab", 100);
//		d.put("cd", 200);
//		d.put("ab", 300);
//		d.put("ef", 100);
//		d.put("io", 100);
		
		
//		
		
		//d.put("ef", null);
		
	Map<Integer, String>v=new ConcurrentHashMap<Integer, String>();
	v.put(1000, "ram");
	v.put(2000, "rom");
	// v.put(null, "sam");
	
	int size = v.size();
	System.out.println(size);
	
	Set<Integer> keySet = v.keySet();
	System.out.println(keySet);
	
	boolean containsKey = v.containsKey(10000);
	System.out.println(containsKey);
	
	boolean containsValue = v.containsValue("raom");
	System.out.println(containsValue);
	
	Collection<String> values = v.values();
	System.out.println(values);
	
	Set<Entry<Integer, String>> entrySet = v.entrySet();
	System.out.println(entrySet);
	
	String string = v.get(1000);
	System.out.println(string);
	
	
	
	
	
	
//		v.put(1000, "som");
//		v.put(20000, "ram");
//		v.put(24, "ram");
//		
		
		
		
		
		//System.out.println(v);
	}
	
}
