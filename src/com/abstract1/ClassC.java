package com.abstract1;

public class ClassC implements IntA{
@Override
public void Brodband() {
	System.out.println("Rs1000");
}
@Override
	public void Mobile() {
		System.out.println("Rs100");
		
	}
public static void main(String[] args) {
	ClassC G=new ClassC();
	G.Brodband();
	G.Mobile();
}
}
