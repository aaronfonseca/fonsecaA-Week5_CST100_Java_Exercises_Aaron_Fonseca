/***************************************************
*                   Employee                       *
*--------------------------------------------------*
* -office: int                                     *
* -salary: double                                  *
* -dateHired: MyDate                               *
* Employee(name: String, address: String,          *
* phoneNumber: String, email: String, office: int, *
* salary: double);                                 *
* +getOffice(): int                                *
* +getSalary(): double                             *
* +getDateHired(): MyDate                          * 
* +setOffice(office: int): void                    *
* +setSalary(salary: double): void                 *
* +setDateHired(dateHired: MyDate): void           *
* +toString():String                               *
***************************************************/

// Create Employee Subclass of Person
public class Employee extends Person {
	
	private int office;
	private double salary;
	private MyDate dateHired;
	
	// Create New Employee obj
	public Employee(String name, String address, String phoneNumber, String email, int office, double salary) {
			this.setName(name);
			this.setAddress(address);
			this.setPhoneNumber(phoneNumber);
			this.setEmail(email);
			this.office = office;
			this.salary = salary;
			this.dateHired = new MyDate();
		}
	
	// Return Office
	public int getOffice() {
		return office;
	}
	
	// Set Office
	public void setOffice(int office) {
		this.office = office;
	}
	
	// Return Salary
	public double getSalary() {
		return salary;
	}
	
	// Set Salary
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Return Date Hired String
	public String getDateHired() {
		return dateHired.getMonth() +"/"+ dateHired.getDay() +"/"+ dateHired.getYear() ;
	}

	// Set Date Hired
	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}
	
	// Return SuperClass String + New information
	public String toString() {
		return super.toString() + 
				"\n\tOffice: " + office + 
				"\n\tSalary: $" + getSalary() + 
				"\n\tDate hired: " + getDateHired();
	}

}
