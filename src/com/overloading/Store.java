package com.overloading;

public class Store extends Supermarket{
@Override
public void Grocery() {
	// TODO Auto-generated method stub
	super.Grocery();
}
@Override
	public void Grocery(String s) {
		// TODO Auto-generated method stub
		super.Grocery(s);
	}
@Override
	public void Grocery(String C, int N) {
		// TODO Auto-generated method stub
		super.Grocery(C, N);
	}
public static void main(String[] args) {
	Store F=new Store();
	F.Grocery();
	F.Grocery("Wheat");
	F.Grocery("RS", 600);
}

}
