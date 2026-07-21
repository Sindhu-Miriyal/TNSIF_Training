package org.tnsif.acc.c2tc.datatype_typecasting;

public class FoodOrder {

	public static void main(String[] args) {
		
		//primitive
		
		int orderId = 101;
		double price=299.99;
		boolean isDelivered=false;
		char rating='A';
		float deliveryDistance=5.3f;
		long deliveryBoyPhone=8907654321L;
		byte deliveryTime=45;
	    short	restaruantId=12;
	    
	    //non-primitive
	    
	    String CustomerName="Sindhu";
	    String[] foodItem= {"Burger","fries","coke"};
	    
	    
	    System.out.println("Order Summary");
	    System.out.println("Customer Name:"+CustomerName);
	    System.out.println("Order Id:"+orderId);
	    System.out.println("RestaurantID" +restaruantId);
	    System.out.println("Delivery Boy Contact:" +deliveryBoyPhone);
	    System.out.println("Food items:");
	    for(String item:foodItem) {
	    	System.out.println(" - " +item);
	    }
	    System.out.println("Total Price:" +price);
	    System.out.println("DeliveryDistance:" +deliveryDistance);
	    System.out.println("Excepted Time:" +deliveryTime);
	    System.out.println("Delivery Status:"+deliveryTime);
	    System.out.println("Rating:" +rating);
	    
	    
	}

}
