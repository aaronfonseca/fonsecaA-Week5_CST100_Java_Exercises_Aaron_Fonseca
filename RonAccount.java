/** Program: Account Class
* File: TestAccountClass.java
* Summary: Create an Account class and interact with it.
* Author: Ronald Pearl
* Date: July 1, 2016 
**/

import java.util.ArrayList;
import java.util.Date;

public class RonAccount {

	private String name;
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	private ArrayList<Transaction> transactions;

	// Create Default Account
	RonAccount() {
		name = "";
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date(); 
		transactions = new ArrayList<Transaction>();
		}
		
	//Creates an account with newId and newBalance
	RonAccount(int newId, double newBalance, String newName) {
			id = newId;
			balance = newBalance;
			name = newName;
			dateCreated = new Date();
		}

	public int getId () {
		return id;
	}

	public double getbalance () {
		return balance;
	}

	public double getAnnualInterestRate () {
		return annualInterestRate;
	}

	public Date getDateCreated () {
		return dateCreated;
	}

	public double getMonthlyInterest() {
		return balance * ((annualInterestRate / 12) / 100);
	}

	public void setId (int theNewId) {
		id = theNewId;
	}

	public void setbalance (double theNewBalance) {
		balance = theNewBalance;
	}

	public void setAnnualInterestRate (double theNewInterestRate) {
		annualInterestRate = theNewInterestRate;
	}

	/*
	*	withdraw()
	*
	*	Removes a specified amount from the balance
	*/
	public void withdraw(double amntToWithdraw) {
		balance = balance - amntToWithdraw;
		transactions.add(new Transaction('W', amntToWithdraw, balance, "Withdrawal from account"));
	}

	/*
	*	deposit()
	*
	*	Adds a specified amount to the balance
	*/
	public void deposit(double amntToDeposit) {
		balance = balance + amntToDeposit;
		transactions.add(new Transaction('D', amntToDeposit, balance, "Deposit to account"));
		

	}

	// Added by Aaron
	public String getName() {
		return name;
	}

	// Added by Aaron
	public void setName(String name) {
		this.name = name;
	}
}