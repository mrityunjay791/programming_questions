package com.java.oops.association;

public class AggregationLineItem {
	private int id;
	private int quantity;
	private Product p;

	public AggregationLineItem(int id, int quantity, Product p) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.p = p;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "AggregationLineItem [id=" + id + ", quantity=" + quantity + ", p=" + p + "]";
	}

}
