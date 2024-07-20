package com.keywords;

public class ReturnKeyword {
private int Maths() {
int a=100;
return a;

}
private int Mathematics() {
int b=99;
return b;

}
	public static void main(String[] args) {
		ReturnKeyword r=new ReturnKeyword();
		System.out.println(r.Mathematics()-r.Maths());
	}
}
