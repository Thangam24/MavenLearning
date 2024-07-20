package com.inheritance;

public class GrandChild extends Child{
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
	@Override
	public void bike() {
		// TODO Auto-generated method stub
		super.bike();
	}
	private void cycle() {
		System.out.println("BSA");
	}
	public static void main(String[] args) {
		GrandChild gc=new GrandChild();
		gc.land();
		gc.car();
		gc.bike();
		gc.cycle();
	}
}
