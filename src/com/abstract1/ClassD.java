package com.abstract1;

public interface ClassD extends IntA,IntB{
@Override
default void Mobile() {
	System.out.println("Rs200");
	
}
@Override
	default void Brodband() {
		System.out.println("Rs 500");
		
	}
@Override
	default void HouseRent() {
		System.out.println("Rs2k");
		
	}
@Override
	default void Medical() {
		System.out.println("Rs5k");
	}
public static void main(String[] args) {
	ClassD M=new ClassD() {
	};
	M.Brodband();
	M.Mobile();
	M.HouseRent();
	M.Medical();
	
}
}
