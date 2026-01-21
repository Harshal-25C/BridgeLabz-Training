package com.day9.ECommerceProductInventory;
import java.util.Scanner;

public class EcommerceInventoryApp {
	public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     ProductBST bst = new ProductBST();
     int choice;

     //Sample data
     bst.insert(105, "Keyboard", 799);
     bst.insert(101, "Mouse", 399);
     bst.insert(108, "Monitor", 8999);
     bst.insert(103, "Headphones", 1299);

     do {
         System.out.println("\n--- E-Commerce Product Inventory ---");
         System.out.println("1. Lookup Product by SKU");
         System.out.println("2. Update Product Price");
         System.out.println("3. Display All Products (Sorted)");
         System.out.println("4. Exit");
         System.out.print("Enter choice: ");

         choice = sc.nextInt();

         switch (choice) {

             case 1:
                 System.out.print("Enter SKU: ");
                 bst.lookup(sc.nextInt());
                 break;

             case 2:
                 System.out.print("Enter SKU: ");
                 int sku = sc.nextInt();
                 System.out.print("Enter new price: ");
                 double price = sc.nextDouble();
                 bst.updatePrice(sku, price);
                 break;

             case 3:
                 bst.displayAll();
                 break;

             case 4:
                 System.out.println("Exiting inventory system...");
                 break;

             default:
                 System.out.println("Invalid choice!");
         }

     }while(choice != 4);
 }
}
