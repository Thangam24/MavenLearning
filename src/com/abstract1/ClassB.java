package com.abstract1;

public class ClassB extends ClassA{

	@Override
	public void Payslip() {
	System.out.println("30k");
		
	}
@Override
public void Salary() {
	// TODO Auto-generated method stub
	super.Salary();
}
public static void main(String[] args) {
	ClassB C=new ClassB();
	C.Payslip();
	C.Salary();
}
}
