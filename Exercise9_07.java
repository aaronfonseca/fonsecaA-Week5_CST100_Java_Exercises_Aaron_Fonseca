/** Program: Exercise 9.07
* File: Exercise9_07.java
* Summary: (The Account class)
* 
* Write a test program that creates an Account object with an account ID of 1122,
* a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
* method to withdraw $2,500, use the deposit method to deposit $3,000, and print
* the balance, the monthly interest, and the date when this account was created.
*
* Author: Aaron Fonseca
* Date: July 2, 2016
**/

public class Exercise9_07 {

	public static void main(String[] args) {
		
		// Create a new Account Object
		Account newAccount = new Account(1122, 20000);
		
		newAccount.setAnnualInterestRate(4.5);
		newAccount.withdraw(2500);
		newAccount.deposit(3000);
			
		// Get Balance
		double dollars = newAccount.getBalance();
		double monthlyInterest = newAccount.getMonthlyInterest();
		
		// Convert Balance to US Dollar Sting
		String usDollars = java.text.NumberFormat.getCurrencyInstance().format(dollars);
		String usDollarsInterest = java.text.NumberFormat.getCurrencyInstance().format(monthlyInterest);
		
		System.out.printf("The balance is " + usDollars + "\n");
		System.out.printf("The monthly interest " + usDollarsInterest + "\n");	
		System.out.printf("The date the account was created is " + newAccount.getDateCreated());		
	}
}