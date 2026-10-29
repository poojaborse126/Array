/*Requirement: Store sales for seven days, calculate weekly sales, and identify the 
best-performing day. */
package com.test;

public class WeeklySales {
	public static void main(String[] args) {

		int[] sales = { 1200, 1500, 1000, 1800, 2000, 1700, 2200 };

		int total = 0;
		int highest = sales[0];
		int bestDay = 1;

		for (int i = 0; i < sales.length; i++) {

			total += sales[i];

			if (sales[i] > highest) {
				highest = sales[i];
				bestDay = i + 1;
			}
		}

		System.out.println("Weekly Sales = " + total);
		System.out.println("Best Day = " + bestDay);
		System.out.println("Highest Sales = " + highest);
	}
}
