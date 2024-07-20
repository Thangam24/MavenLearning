package com.inheritance;

public class Child2 extends Parent{
@Override
public void land() {
	// TODO Auto-generated method stub
	super.land();
}
@Override
	public void car() {
		// TODO Auto-generated method stub
		super.car();
	}

public static void main(String[] args) {
	Child2 c2=new Child2();
	c2.land();
	c2.car();
}
}
