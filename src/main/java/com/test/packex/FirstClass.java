package com.test.packex.packone;

public class FirstClass
{
	private int pri_val = 10;
	int def_val = 20;
	protected int prot_val = 30;
	public int pub_val = 40;

	public FirstClass(){
		System.out.println("\nThis is FirstClass");
		System.out.println("Private variable pri_val = " + pri_val);
		System.out.println("Default variable def_val = " + def_val);
		System.out.println("Protected variable prot_val = " + prot_val);
		System.out.println("Public variable pub_val = " + pub_val);
	}
}