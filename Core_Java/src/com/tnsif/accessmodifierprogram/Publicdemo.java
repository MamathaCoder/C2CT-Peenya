package com.tnsif.accessmodifierprogram;
//demo for public access modifier 
//private(within same class)
//
public class Publicdemo {
	public int a=11;//data members
	private String b="Maxx";
	char w='i';
	protected int s=8;
	
	public void display() {//function , methods
		System.out.println("Welcome");
	}
	public static void main(String[] args) {
		Publicdemo p=new Publicdemo();
		
		System.out.println(p.a);
		System.out.println(p.b);
		System.out.println(p.s);
		System.out.println(p.w);
	}
}
