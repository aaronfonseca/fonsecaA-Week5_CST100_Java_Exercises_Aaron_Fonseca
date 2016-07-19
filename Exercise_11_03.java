/** Program: Exercise 11.03
* File: Exercise11_03.java
* Summary: Chapter 11, Exercise 03.  (Subclasses of Account)
* 
* In Programming Exercise 9.7, the Account class was
defined to model a bank account. An account has the properties account number,
balance, annual interest rate, and date created, and methods to deposit and withdraw
funds. Create two subclasses for checking and saving accounts. A checking
account has an overdraft limit, but a savings account cannot be overdrawn.

* Author: Aaron Fonseca
* Date: July 19, 2016
**/

public class Exercise_11_03 {

	public static void main(String[] args) {
		
		// Create a new StopWatch Object
		Account testAccount = new Account(1122, 20000);
		
		testAccount.setAnnualInterestRate(4.5);
		
		testAccount.withdraw(2500);
		
		testAccount.deposit(3000);
			
		// Get Balance
		double dollars = testAccount.getBalance();
		double monthlyInterest = testAccount.getMonthlyInterest();
		
		// Conver Balance to US Dollar Sting
		String usDollars = java.text.NumberFormat.getCurrencyInstance().format(dollars);
		String usDollarsInterenst = java.text.NumberFormat.getCurrencyInstance().format(monthlyInterest);
		
		System.out.printf("The balance is " + usDollars + "\n");
		System.out.printf("The monthly interest " + usDollarsInterenst + "\n");	
		System.out.printf("The date the account was created is " + testAccount.getDateCreated());		
	}
}