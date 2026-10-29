/*Requirement: Store marks of five students, calculate total and average marks, 
and find the highest and lowest scores. */
package com.test;

public class StudentMarks {
	public static void main(String[] args) {

		int[] marks = { 75, 85, 90, 60, 95 };

		int total = 0;
		int highest = marks[0];

		int lowest = marks[0];

		for (int mark : marks) {

			total += mark;

			if (mark > highest)
				highest = mark;

			if (mark < lowest)
				lowest = mark;
		}

		System.out.println("Total = " + total);
		System.out.println("Average = " + (double) total / marks.length);
		System.out.println("Highest = " + highest);
		System.out.println("Lowest = " + lowest);
	}
}
