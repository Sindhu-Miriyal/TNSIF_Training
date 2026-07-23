package org.tnsif.acc.c2tc.opps;
 class Human{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	public int getAge() {
		return age;
	}
	
 }
public class EncapsulationDemo {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.setAge(12);
		obj.setName("Sindhu");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
		obj.setAge(26);
		obj.setName("Hema");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
	}

}
