package com.tnsif.interfacedemo;

public class Nestedinterface implements Myinterface.MyInnerInterface{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Welcom to java");
		
	}
	public static void main(String[] args) {
		Nestedinterface n=new Nestedinterface();
		n.print();
		System.out.println(n.id);
		System.out.println(Nestedinterface.id);
	}

}
