package org.tnsif.acc.c2tc.interfacedemo;

class SmartLight implements SmartDevice
{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getStatus() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceDemo{

	public static void main(String[] args) {
		
			SmartDevice smart=new SmartLight();
			smart.turnOn();
	        smart.turnOff();
	        smart.getStatus();
	

	}

}
