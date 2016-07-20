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
		Account NormalAccount = new Account(1122, 2000);
		CheckingAccount CheckingAccount = new CheckingAccount(1010, 2000);
		SavingsAccount SavingsAccount = new SavingsAccount(1156, 2000);
		
		NormalAccount.setAnnualInterestRate(4.5);
		NormalAccount.withdraw(2500);
		NormalAccount.deposit(3000);
			
		System.out.println(NormalAccount.toString() +"\n" );
		
		CheckingAccount.setAnnualInterestRate(4.5);
		CheckingAccount.withdraw(2500);
		CheckingAccount.deposit(3000);
		
		System.out.println(CheckingAccount.toString() +"\n" );	
		
		SavingsAccount.setAnnualInterestRate(4.5);
		SavingsAccount.withdraw(2500);
		SavingsAccount.deposit(1000);
		
		System.out.println(SavingsAccount.toString() +"\n" );	
	}
}