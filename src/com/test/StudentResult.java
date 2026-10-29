/*Requirement: Store marks of three students in three subjects and calculate each 
student's total and average. */
package com.test;

public class StudentResult {
	public static void main(String[] args) {

		int[][] marks = { { 80, 75, 90 }, { 60, 70, 65 }, { 95, 85, 90 } };

		for (int i = 0; i < marks.length; i++) {

			int total = 0;

			for (int j = 0; j < marks[i].length; j++) {
				total += marks[i][j];
			}

			double average = (double) total / marks[i].length;

			System.out.println("Student " + (i + 1));
			System.out.println("Total = " + total);
			System.out.println("Average = " + average);
		}
	}
}
