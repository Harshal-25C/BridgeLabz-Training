package com.day9.ECommerceProductInventory;

class ProductBST {

 ProductNode root;

 //Insert product
 public void insert(int sku, String name, double price) {
     root = insertRec(root, sku, name, price);
 }

 private ProductNode insertRec(ProductNode root, int sku, String name, double price) {
     if(root == null) {
         return new ProductNode(sku, name, price);
     }

     if(sku < root.sku) {
         root.left = insertRec(root.left, sku, name, price);
     }else if (sku > root.sku) {
         root.right = insertRec(root.right, sku, name, price);
     }else {
         System.out.println("Duplicate SKU not allowed!");
     }
     return root;
 }

 // 1️ Lookup product
 public void lookup(int sku) {
     ProductNode result = search(root, sku);
     if(result != null) {
         displayProduct(result);
     }else {
         System.out.println("Product not found!");
     }
 }

 // Search helper
 private ProductNode search(ProductNode root, int sku) {
     if(root == null || root.sku == sku)
         return root;

     if(sku < root.sku)
         return search(root.left, sku);

     return search(root.right, sku);
 }

 // 2️ Update price
 public void updatePrice(int sku, double newPrice) {
     ProductNode product = search(root, sku);
     if(product != null) {
         product.price = newPrice;
         System.out.println("Price updated successfully.");
     }else {
         System.out.println("Product not found!");
     }
 }

 // 3️ Display sorted products
 public void displayAll() {
     if(root == null) {
         System.out.println("Inventory is empty.");
         return;
     }
     System.out.println("Products (Sorted by SKU):");
     inorder(root);
 }

 private void inorder(ProductNode root) {
     if(root != null) {
         inorder(root.left);
         displayProduct(root);
         inorder(root.right);
     }
 }

 private void displayProduct(ProductNode p) {
     System.out.println(
             "SKU: " + p.sku +
             ", Name: " + p.name +
             ", Price: ₹" + p.price
     );
 }
}
