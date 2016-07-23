/** Program: Exercise 11.08
* File: Exercise_11_08.java
* Summary: (New Account class)
* 
* An Account class was specified in Programming
* Exercise 9.7. Design a new Account class as follows:
* 1. Add a new data field name of the String type to store the name of the
* customer.
* 2. Add a new constructor that constructs an account with the specified name, id,
* and balance.
* 3. Add a new data field named transactions whose type is ArrayList
* that stores the transaction for the accounts. Each transaction is an instance
* of the Transaction class. The Transaction class is defined as shown in
* Figure 11.6.
* 4. Modify the withdraw and deposit methods to add a transaction to the
* transactions array list.
* 5. All other properties and methods are the same as in Programming Exercise 9.7.
* 
* Write a test program that creates an Account with annual interest rate 1.5%,
* balance 1000, id 1122, and name George. Deposit $30, $40, and $50 to the
* account and withdraw $5, $4, and $2 from the account. Print an account summary
* that shows account holder name, interest rate, balance, and all transactions.
*
* Author: Aaron Fonseca
* Date: July 222, 2016
**/

public class Exercise_11_08 {

	public static void main(String[] args) {
		
		// Create a new Account Object
		Account newAccount = new Account(1000, 1122, "George");
		
		newAccount.setAnnualInterestRate(1.5);
		newAccount.deposit(30);
		newAccount.deposit(40);
		newAccount.deposit(50);
		newAccount.withdraw(5);
		newAccount.withdraw(4);
		newAccount.withdraw(2);
			
		// Get Balance
		double dollars = newAccount.getBalance();
		double monthlyInterest = newAccount.getMonthlyInterest();
		
		// Convert Balance to US Dollar Sting
		String usDollars = java.text.NumberFormat.getCurrencyInstance().format(dollars);
		String usDollarsInterest = java.text.NumberFormat.getCurrencyInstance().format(monthlyInterest);
		
		System.out.println("Account Summary\n"); 
		System.out.printf("Account Holder Name:" + newAccount.getName() + "\n");
		System.out.printf("Balance:" + usDollars + "\n");
		System.out.printf("Monthly interest " + usDollarsInterest + "\n");	
		System.out.printf("The date the account was created is " + newAccount.getDateCreated());	
		
		for (int i = 0; i < newAccount.getTransactions().size(); i++) {
			System.out.println("Date: " + (newAccount.getTransactions()).get(i).getDate());
			System.out.println("Type: " + (newAccount.getTransactions()).get(i).getType());
			System.out.println("Amount: " + (newAccount.getTransactions()).get(i).getAmount());
			System.out.println("Balance: " + (newAccount.getTransactions()).get(i).getBalance());
			System.out.println("Description: " + (newAccount.getTransactions()).get(i).getDescription());
			System.out.println();
		}
		
		
	}
}