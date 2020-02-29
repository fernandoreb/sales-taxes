package com.farg.sales.taxes.model;

public class ShoppingCartResume {

	private ShoppingCart shoppingCart;
	
	private Float salesTaxes;

	private Float total;

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public Float getSalesTaxes() {
		return salesTaxes;
	}

	public void setSalesTaxes(Float salesTaxes) {
		this.salesTaxes = salesTaxes;
	}

	public Float getTotal() {
		return total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}

}
