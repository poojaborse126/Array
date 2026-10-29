//Requirement: Increase every employee's salary by 10%.
package com.test;

public class SalaryIncrement {
	public static void main(String[] args) {

		double[] salaries = { 25000, 30000, 35000, 40000 };

		for (int i = 0; i < salaries.length; i++) {

			salaries[i] = salaries[i] * 1.10;

			System.out.println("Updated Salary = " + salaries[i]);
		}
	}
}
