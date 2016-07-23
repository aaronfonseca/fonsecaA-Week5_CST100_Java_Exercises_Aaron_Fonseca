/***************************************************
*                    Staff                         *
*--------------------------------------------------*
* -title: String                                   *
* Staff(name: String, address: String,             *
* phoneNumber: String, email: String, office: int, *
* salary: double, title: String)                   *
* +getTitle(): string                              *
* +setTitle(title: string): void                   *
* +toString():String                               *
***************************************************/

// Create Employee Subclass of Person
public class Staff extends Employee {
	
	private String title;
	
	// Create New Employee obj
	public Staff(String name, String address, String phoneNumber, String email, 
			int office, double salary, String title) {
			super(name, address, phoneNumber, email, office, salary);
			this.setTitle(title);
		}
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	
	// Return SuperClass String + New information
	public String toString() {
		return super.toString() + "\n\tTitle: " + title;
	}

}
