package com.overloading;

public class Overriding extends Organisation{
	@Override
	public void Employee() {
		// TODO Auto-generated method stub
		super.Employee();
	}
	@Override
	public void Employee(String s) {
		// TODO Auto-generated method stub
		super.Employee(s);
	}
	@Override
	public void Employee(int i) {
		// TODO Auto-generated method stub
		super.Employee(i);
	}
	@Override
	public void Employee(String a2, int N) {
		// TODO Auto-generated method stub
		super.Employee(a2, N);
	}
	public static void main(String[] args) {
		Overriding e=new Overriding();
		e.Employee();
		e.Employee("Gayathri");
		e.Employee(765346);
		e.Employee("dinesh", 45673);
		
		
	}
}
