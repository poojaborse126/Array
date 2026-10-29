/* Requirement: Store monthly sales for three products over four months and 
calculate total sales for each product. */
package com.test;

public class ProductSales {
	public static void main(String[] args) {

		int[][] sales = { { 1000, 1200, 1500, 1300 }, 
				          { 2000, 1800, 2200, 2500 }, 
				          { 1500, 1600, 1700, 1900 } };

		for (int i = 0; i < sales.length; i++) {

			int total = 0;

			for (int j = 0; j < sales[i].length; j++) {
				total += sales[i][j];
			}

			System.out.println("Product " + (i + 1) + " Sales = " + total);
		}
	}
}
