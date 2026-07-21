package org.tnsif.acc.c2tc.datatype_typecasting;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//shopping cart
		
		//widening(small-large)
		
		 double pricePerItem=99.60;
		 int quantity=3;
		 double totalPrice=quantity* pricePerItem;
		 
		 //narrowing(large-small)
		 
		 double discount=10.75;
		 int roundedDiscount=(int)discount;
		 
		 double finalAmount=totalPrice-roundedDiscount;
		 
		 System.out.println("Online shopping summary");
		 System.out.println("Items Bought: "+quantity);
		 System.out.println("Price per item:"+pricePerItem);
		 System.out.println("Final amount to pay after discount:" +finalAmount);

	}

}
