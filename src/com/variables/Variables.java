package com.variables;

public class Variables {
	
	int a=10;
	static int b=100;
	

private void localVariable() {
String d="divya";
System.out.println(d);


}
public static void main(String[] args) {
	Variables v=new Variables();
	v.localVariable();
	System.out.println(v.a);
	System.out.println(b);
}
}
