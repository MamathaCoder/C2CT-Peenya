package com.tnsif.interfacedemo;
//demo for nested interface
public interface Myinterface {
	void calculateArea();
	
	//nested interface
	interface MyInnerInterface{
		int id=45;
		void print();
	}

}
