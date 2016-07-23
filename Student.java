/****************************************************
*                   Student                         *
*------------------------------------------------   *
* -status: String                                   *
* +Student(name: String, address: String,           *
*  phoneNumber: String, email: String, status: int) *
* +getStatus(): String                              *
* +setStatus(status: String): void                  *
* +toString(): String                               *
****************************************************/

public class Student extends Person{

	 private int status;
	 public final static int FRESHMAN = 1;
	 public final static int SOPHOMORE = 2;
	 public final static int JUNIOR = 3;
	 public final static int SENIOR = 4;
	 
	 // Create New Student Object
	 public Student(String name, String address, String phoneNumber, String email, int status){
		 this.setName(name);
		 this.setAddress(address);
		 this.setPhoneNumber(phoneNumber);
		 this.setEmail(email);
		 this.setStatus(status);
		 
	 }

	// Return Status
	public String getStatus() {
		switch (status) {
		case 1 : return "freshman"; 
		case 2 : return "sophomore"; 
		case 3 : return "junior"; 
		case 4 : return "senior";
		default : return "Unknown"; 
		}
	}

	// Set Status
	public void setStatus(int status) {
		this.status = status;
	}
	
	// Add status to SuperClass toString
	public String toString() {
		return super.toString() + "\n\tClass Status: " + getStatus();
	}
	
}
