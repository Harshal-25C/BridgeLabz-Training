package com.day9.ECommerceProductInventory;

class ProductNode {
	int sku;
	String name;
	double price;
	ProductNode left, right;

    public ProductNode(int sku, String name, double price) {
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.left = this.right = null;
    }
}

