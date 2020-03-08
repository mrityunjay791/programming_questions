package com.java.oops.association.copy;

public class CompositionMain {

	public static void main(String[] args) {
		Product p = new Product(1, "Bulb", "LED LIGHT");
		Product p2 = new Product(2, "Bulb-2", "LED LIGHT-2");
		
		AggregationLineItem item = new AggregationLineItem(1, 5, p);
		AggregationLineItem item2 = new AggregationLineItem(1, 5, p2);
		
		CompositionOrder order1 = new CompositionOrder(1, "order-1");
		order1.addItem(item);
		System.out.println(item);
		order1 = null; // Exception in thread "main" java.lang.NullPointerException because of addItem method of order1 object.
		System.out.println(item);
		CompositionOrder order2 = new CompositionOrder(2, "order-2");
		order2.addItem(item2);
		
		
		
	}

}
