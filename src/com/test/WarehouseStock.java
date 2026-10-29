/*Requirement: A company has three warehouses, each storing four product 
categories. Find total stock across all warehouses. */
package com.test;

public class WarehouseStock {
	public static void main(String[] args) {

		int[][] stock = { { 100, 200, 150, 80 },
						  { 120, 180, 160, 90 }, 
						  { 110, 210, 140, 100 } };

		int totalStock = 0;

		for (int i = 0; i < stock.length; i++) {

			int warehouseTotal = 0;

			for (int j = 0; j < stock[i].length; j++) {
				warehouseTotal += stock[i][j];
			}

			totalStock += warehouseTotal;

			System.out.println("Warehouse " + (i + 1) + " Stock = " + warehouseTotal);
		}

		System.out.println("Overall Stock = " + totalStock);
	}
}
