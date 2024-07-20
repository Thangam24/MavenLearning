package com.inheritance2;

public class VivoPlus extends OnePlus{
@Override
public void nord() {
	// TODO Auto-generated method stub
	super.nord();
}
@Override
	public void ikon() {
		// TODO Auto-generated method stub
		super.ikon(); //super=parent class ref.name
	}
public static void main(String[] args) {
	VivoPlus v2=new VivoPlus();
	v2.ikon();
	v2.nord();
	
}
}
