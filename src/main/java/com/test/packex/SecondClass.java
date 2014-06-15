package com.test.packex.packone;

public class SecondClass
{
	public SecondClass() {
		FirstClass fc = new FirstClass();
		System.out.println("\nThis is SecondClass");
		//System.out.println("Private variable pri_val = " + fc.pri_val);
		System.out.println("Default variable def_val = " + fc.def_val);
		System.out.println("Protected variable prot_val = " + fc.prot_val);
		System.out.println("Public variable pub_val = " + fc.pub_val);
	}
}