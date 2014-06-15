package com.test.packex.packtwo;

import com.test.packex.packone.FirstClass;

public class FourthClass
{
	public FourthClass() {
		FirstClass fc = new FirstClass();
		System.out.println("\nThis is FourthClass");
		//System.out.println("Private variable pri_val = " + fc.pri_val);
		//System.out.println("Default variable def_val = " + fc.def_val);
		//System.out.println("Protected variable prot_val = " + fc.prot_val);
		System.out.println("Public variable pub_val = " + fc.pub_val);
	}
}