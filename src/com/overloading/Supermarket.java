package com.overloading;

public class Supermarket {
	public void Grocery() {
		// TODO Auto-generated method stub
	System.out.println("Grocery");
	}
	public void Grocery(String s){
		// TODO Auto-generated method stub
	System.out.println("Grocery name"+" "+s);
	}
	public void Grocery(int A,String d) {
		// TODO Auto-generated method stub
	System.out.println("Product no:"+" "+A+" "+d);
	}
	public void Grocery(int B) {
		// TODO Auto-generated method stub
	System.out.println("Product code"+" "+B);
	}
	public void Grocery(String C,int N) {
		// TODO Auto-generated method stub
	System.out.println("MRP:"+" "+C+" "+N);
	}
	public static void main(String[] args) {
		Supermarket V=new Supermarket();
		V.Grocery();
		V.Grocery(123);
		V.Grocery("Rice");
		V.Grocery(234, "RR");
		V.Grocery("RS", 500);
	}
}
