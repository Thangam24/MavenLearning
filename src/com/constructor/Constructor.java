package com.constructor;

public class Constructor {
public Constructor() {
	this(0);
	
	System.out.println("ATM");
}
public Constructor(int A) {   //non parameterised constructor or default constructor
	this(null);
	System.out.println(A);

}
public Constructor(String S) { // parameterised constructor
	System.out.println("HDFC");
	
}
public static void main(String[] args) {
	Constructor C=new Constructor();
	
}
}
