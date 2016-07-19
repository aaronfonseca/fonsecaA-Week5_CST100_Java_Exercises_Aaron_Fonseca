/***************************************************************************
*                              CheckingAccount                             *
*--------------------------------------------------------------------------*
* -overDraftLimit: double                                                  *
* +CheckingAccount()                                                       *
* +CheckingAccount(newId: int, newBalance: double, overDraftLimit: double) *
* +setOverDraftLimit(overDraftLimit: double): void                         *
* +getOverDraftLimit(): double                                             *
* +withdraw(amount: double): boolean                                       *
* +toString(): String                                                      *
****************************************************************************/

public class CheckingAccount extends Account{
	
	private double overDraftLimit;
	
	// Create Default Checking Account
	CheckingAccount() {
		super();
		this.overDraftLimit = 50;
		}
		
	//Creates an Checking account with newId and newBalance
	CheckingAccount(int newId, double newBalance) {
			super(newId, newBalance);
			this.overDraftLimit = 50;
			
		}
	
	// Set overDraftLimit
	public void setOverDraftLimit(double overDraftLimit){
		this.overDraftLimit = overDraftLimit;
	}
	
	// Get overDraftLimit
	public double getOverDraftLimit(){
		return overDraftLimit;
	}
	
	// Withdraw
	public void withdraw(double amount) {
		if( (getBalance() - amount) > -overDraftLimit)
		{
			setBalance(getBalance() - amount);
		} else
		{
			System.out.println("Warning: Your Checking Account can not be overdrafted more than " + overDraftLimit);
		}
				
	}
	
	// Return a String description of CheckingAccount class
	public String toString() {
		return super.toString() + "\nOverdraft limit: $" + String.format("%.2f", overDraftLimit);
	}

}
