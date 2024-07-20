package com.abstract1;

public class ClassF implements IntA,IntB {

	@Override
	public void Brodband() {
		System.out.println("Rs500");
	}

	@Override
	public void Mobile() {
		System.out.println("Rs100");
	}

	@Override
	public void HouseRent() {
		System.out.println("Rs5000");
	}

	@Override
	public void Medical() {
		System.out.println("Rs10000");
	}
public static void main(String[] args) {
	ClassF n=new ClassF();
	n.Brodband();
	n.HouseRent();
	n.Medical();
	n.Medical(); 
}
}
