/*Requirement: Create a 3 × 4 seating arrangement. Book a seat if it is available. 
0 represents available, and 1 represents booked.*/
package com.test;

public class SeatBooking {
	public static void main(String[] args) {

		int[][] seats = new int[3][4];

		int row = 1;
		int column = 2;

		if (seats[row][column] == 0) {
			seats[row][column] = 1;
			System.out.println("Seat Booked Successfully");
		} else {
			System.out.println("Seat Already Booked");
		}

		for (int[] seatRow : seats) {
			for (int seat : seatRow) {
				System.out.print(seat + " ");
			}
			System.out.println();
		}
	}
}
