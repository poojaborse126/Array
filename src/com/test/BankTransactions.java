/*Requirement: Positive values represent deposits, and negative values represent 
withdrawals. Calculate total deposits, total withdrawals, and net transaction 
amount. */
package com.test;

public class BankTransactions {
	public static void main(String[] args) {

		int[] transactions = { 5000, -2000, 3000, -1000, 4000 };

		int deposits = 0;
		int withdrawals = 0;

		for (int amount : transactions) {

			if (amount > 0)
				deposits += amount;
			else
				withdrawals += -amount;
		}

		System.out.println("Deposits = " + deposits);
		System.out.println("Withdrawals = " + withdrawals);
		System.out.println(

				"Net Amount = " + (deposits - withdrawals));
	}
}
