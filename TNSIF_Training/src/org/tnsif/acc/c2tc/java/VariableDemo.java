package org.tnsif.acc.c2tc.java;

public class VariableDemo {
	int price=10;
	void print() {
		String msg="hello";
		System.out.println(msg);
	}
	static String mesage="Hello Students";
	public static void main(String[] args) {
		VariableDemo obj=new VariableDemo();
		System.out.println(obj.price);
		obj.print();
		System.out.println(mesage);
	
	}
}
