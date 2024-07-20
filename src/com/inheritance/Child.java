package com.inheritance;

public class Child extends Parent{
	@Override
	public void car() {
		super.car();   //super=parent class ref.name
	}
	@Override
	public void land() {
		super.land();
	}
	public void bike() {
		System.out.println("YAMAHA");
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.bike();
		c.car();
		c.land();
	}
	
}
