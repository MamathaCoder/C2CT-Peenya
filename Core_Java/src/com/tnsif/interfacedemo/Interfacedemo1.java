package com.tnsif.interfacedemo;
//demo for normal interface example

interface SmartDevice{
	void TurnOn();
	void TurnOff();
	void Getstatus();
}
//class implementing the interface

class Smartlight implements SmartDevice{

	@Override
	public void TurnOn() {
		// TODO Auto-generated method stub
		System.out.println("smart light is on");
		
	}

	@Override
	public void TurnOff() {
		// TODO Auto-generated method stub
		System.out.println("smart light is off");
		
	}

	@Override
	public void Getstatus() {
		// TODO Auto-generated method stub
		System.out.println("smart light is standly moode");
		
		
	}
	
public class Interfacedemo1 {
	public static void main (String args) {
		Smartlight s=new Smartlight();
		s.TurnOn();
		s.TurnOff();
		s.Getstatus();
	}
}

}
