//Calculate the sum of all matrix elements
package com.test;

public class MatrixSum {
	public static void main(String[] args) {

		int[][] arr = { { 10, 20 }, { 30, 40 } };

		int sum = 0;

		for (int[] row : arr) {
			for (int num : row) {
				sum += num;
			}
		}

		System.out.println("Sum = " + sum);
	}
}
