//Requirement: Check product stock and display an alert if stock is below 10 units. 

package com.test;

public class InventorySystem {
	public static void main(String[] args) {

		String[] products = { "Laptop", "Mouse", "Keyboard", "Monitor" };

		int[] stock = { 15, 5, 8, 20 };

		for (int i = 0; i < products.length; i++) {

			if (stock[i] < 10) {
				System.out.println(products[i] + " - Low Stock Alert");
			}
		}
	}

}
