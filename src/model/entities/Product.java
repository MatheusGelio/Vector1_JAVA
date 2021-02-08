package model.entities;

import model.exceptions.ProductException;

public class Product {
	
	private String productName;
	private double productPrice;
	
	public Product(String productName, double productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public void ProductExceptions() throws ProductException {
		if (productPrice < 0) {
			throw new ProductException("Error! Enter a positive number.");
		}
	}
	
	@Override
	public String toString() {
		return productName + ": $" + String.format("%.2f%n", productPrice);
	}
}
