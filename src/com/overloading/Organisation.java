 package com.overloading;

public class Organisation {
	public void Employee() {
	// TODO Auto-generated method stub
System.out.println("Employee Detaails");
}
	public void Employee(String s) {
	// TODO Auto-generated method stub
System.out.println("Name"+s);
}
	public void Employee(int i) {
	// TODO Auto-generated method stub
System.out.println("Emp ID"+i);
}
	public void Employee(String a2,int N) {
	// TODO Auto-generated method stub
System.out.println("Group name"+" "+a2+"RID"+N);
}
public static void main(String[] args) {
	Organisation o=new Organisation();
	o.Employee();
o.Employee("Divya");
o.Employee(788400);
o.Employee("Shobhan", 300542);
	
}
}
