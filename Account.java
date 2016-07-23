/********************************************************
*                      ACCOUNT                          *
*-------------------------------------------------------*
* -id: int                                              *
* -balance: double                                      *
* -annualInterestRate: double                           *
* -dateCreated: date                                    *
* +Account()                                            *
* +Account(newId: int, newBalance: double)              *
* +setId(newId: int)                                    *
* +setBalance(newBalance: double)                       *
* +setAnnualInterestRate(newAnnualInterestRate: double) *
* +getId(): int                                         *
* +getBalance(): double                                 *
* +getAnnualInterestRate(): double                      *
* +getDateCreated: date                                 *
* +getMonthlyInterestRate(): double                     *
* +getMonthlyInterest(): double                         *
* +withdraw(amount: double)                             *
* +deposit(amount: double)                              *
********************************************************/

import java.util.ArrayList;
import java.util.Date;

public class Account {
	private String name = "unknown";
	protected int id;
	protected double balance;
	protected double annualInterestRate;
	private Date dateCreated;
	private ArrayList<Transaction> transactions;
	
	// Create Default Account
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date(); 
		transactions = new ArrayList<Transaction>();
	}
	
	//Creates an account with newId and newBalance
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
		transactions = new ArrayList<Transaction>();
	}
	
	//Creates an account with newId, newBalance and newName
	Account(int newId, double newBalance, String newName) {
			id = newId;
			balance = newBalance;
			dateCreated = new Date();
			name = newName;
			transactions = new ArrayList<Transaction>();
		}
	
	// Set id
	public void setId(int newId) {
		id = newId;
	}
	
	// Set balance
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
		
	// Set AnnualInterestRate
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	// Get id
	public int getId() {
		return id;
	}
	
	// Get balance
	public double getBalance() {
		return balance;
	}
		
	// Get AnnualInterestRate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	// Get AnnualInterestRate
	public Date getDateCreated() {
		return dateCreated;
	}
	
	// Get monthly interest rate
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	// Get monthly interest
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	// Withdraw
	public void withdraw(double amount) {
		balance -= amount;
		transactions.add(new Transaction('W', amount, balance, "Withdrawal from account"));
	}

	// Deposit
	public void deposit(double amount) {
		balance += amount;
		transactions.add(new Transaction('D', amount, balance, "Deposit to account"));
	}
	
	@Override
    public String toString() {
        return "Account id: " + id + 
        		"\n\t" + "Interest rate: " + annualInterestRate + 
        		"\n\t" + "Balance: $" + String.format("%.2f", balance);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Return transactions
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	
}
