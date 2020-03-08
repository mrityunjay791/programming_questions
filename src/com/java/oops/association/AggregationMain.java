package com.java.oops.association;

public class AggregationMain {

	public static void main(String[] args) {
		Product p = new Product(1, "Bulb", "LED LIGHT");
		Product p2 = new Product(2, "Bulb-2", "LED LIGHT-2");
		Product p3 = new Product(3, "Bulb-3", "LED LIGHT-3");
		Product p4 = new Product(4, "Bulb-4", "LED LIGHT-4");
		
		AggregationLineItem item = new AggregationLineItem(1, 5, p);
		AggregationLineItem item2 = new AggregationLineItem(1, 5, p2);
		
		System.out.println(item);
		item = null;
		System.out.println(item+""+p); // here p object still exit after deleting item.
		System.out.println(item2);
	}

}
