package com.test.packex.packone;

public class ThirdClass extends FirstClass
{
	public ThirdClass(){
		System.out.println("\nThis is ThirdClass");
		System.out.println("This is FirstClass");
		//System.out.println("Private variable pri_val = " + pri_val);
		System.out.println("Default variable def_val = " + def_val);
		System.out.println("Protected variable prot_val = " + prot_val);
		System.out.println("Public variable pub_val = " + pub_val);
	}
}