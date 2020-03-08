package com.java.oops.association;

import java.util.List;

public class CompositionOrder {
	private int id;
	private String name;
	private List<AggregationLineItem> lineItems;
	
	

	public CompositionOrder(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public void addItem(AggregationLineItem item) {
		this.lineItems.add(item);
	}
	
	

}
