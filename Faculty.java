/***************************************************
*                    Faculty                       *
*--------------------------------------------------*
* -officeHours: String                             *
* -rank: String                                    *
* Faculty(name: String, address: String,           *
* phoneNumber: String, email: String, office: int, *
* salary: double, officeHours: int, rank: String)  *
* +getOfficeHours(): int                           *
* +setOfficeHours(officeHours: int): void          *
* +getRank(): String                               *
* +setRank(rank: String): void                     *
* +toString():String                               *
***************************************************/

// Create Employee Subclass of Person
public class Faculty extends Employee {
	
	private String officeHours;
	private String rank;
	
	// Create New Employee obj
	public Faculty(String name, String address, String phoneNumber, String email, 
			int office, double salary, String officeHours, String rank) {
			super(name, address, phoneNumber, email, office, salary);
			this.setOfficeHours(officeHours);
			this.setRank(rank);
		}

	// Return officeHours
	public String getOfficeHours() {
		return officeHours;
	}

	// Set officeHours
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	// Return rank
	public String getRank() {
		return rank;
	}

	//  Set rank
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	// Return SuperClass String + New information
	public String toString() {
		return super.toString() +
				"\n\tOffice hours: " + officeHours +
				"\n\tRank: " + rank;
	}

}
