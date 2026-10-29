/*Requirement: Store attendance of three employees for five working days. 1 
means present and 0 means absent. Calculate present days.*/
package com.test;

public class AttendanceSystem {
	public static void main(String[] args) {

		int[][] attendance = { { 1, 1, 0, 1, 1 }, 
							   { 1, 0, 1, 1, 0 }, 
							   { 1, 1, 1, 1, 1 } };

		for (int i = 0; i < attendance.length; i++) {

			int present = 0;

			for (int j = 0; j < attendance[i].length; j++) {
				if (attendance[i][j] == 1)
					present++;

			}

			System.out.println("Employee " + (i + 1) + " Present Days = " + present);
		}
	}
}
