/***************************************************************************
*                              SavingsAccount                             *
*--------------------------------------------------------------------------*                                                *
* +SavingsAccount()                                                       *
* +SavingsAccount(newId: int, newBalance: double) *                      *                                        *
* +withdraw(amount: double): boolean                                       *
* +toString(): String                                                      *
****************************************************************************/

public class SavingsAccount extends Account{
		
	// Create Default Savings Account
	SavingsAccount() {
		super();
		}
		
	//Creates an Savings account with newId and newBalance
	SavingsAccount(int newId, double newBalance) {
			super(newId, newBalance);			
		}
	

	
	// Withdraw
	public void withdraw(double amount) {
		if( getBalance() > amount)
		{
			setBalance(getBalance() - amount);
		} else
		{
			System.out.println("Warning: Your Savings Account can not be overdrafted.");
		}
				
	}
	
	// Return a String description of CheckingAccount class
	@Override
	public String toString() {
		return "Checking Account id: " + id + 
				"\n\t" + "Interest rate: " + annualInterestRate + 
				"\n\t" + "Balance: $" + String.format("%.2f", balance);
	}

}
