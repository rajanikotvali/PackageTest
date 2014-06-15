package com.test.packex.packtwo;

import com.test.packex.packone.FirstClass;

public class FifthClass extends FirstClass
{
	public FifthClass() {
		System.out.println("\nThis is FifthClass");
		//System.out.println("Private variable pri_val = " + pri_val);
		//System.out.println("Default variable def_val = " + def_val);
		System.out.println("Protected variable prot_val = " + prot_val);
		System.out.println("Public variable pub_val = " + pub_val);
	}
}