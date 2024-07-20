package com.stringtypes;

public class Types {
   //immutable
	public static void main(String[] args) {
		
	
	String d="Help";
	String d2="Help";
	System.out.println(d);
	
	System.out.println(System.identityHashCode(d));
	System.out.println(System.identityHashCode(d2));
	
	String d3=d.concat(d2);
	System.out.println(d3);
	System.out.println(System.identityHashCode(d3));
	
	//mutable
	
	//StringBuffer:
	
	StringBuffer s=new StringBuffer("Terms");
	StringBuffer s2=new StringBuffer("Terms");
	System.out.println(s);
	System.out.println(s2);
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s2));
	
	StringBuffer s3=s.append(s2);
	System.out.println(s3);
	System.out.println(System.identityHashCode(s3));
	
	
    StringBuilder a=new StringBuilder("Toll");
    StringBuilder a2=new StringBuilder("Free");
    System.out.println(a);
    System.out.println(a2);
    System.out.println(System.identityHashCode(a));
    System.out.println(System.identityHashCode(a2));
    
    StringBuilder a3=a.append(a2);
    System.out.println(a3);
    System.out.println(System.identityHashCode(a3));

	
	}
}
