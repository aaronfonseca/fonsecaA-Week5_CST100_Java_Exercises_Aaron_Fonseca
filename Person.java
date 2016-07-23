/********************************************************
*                      PERSON                           *
*-------------------------------------------------------*
* -name: String                                         *
* -address: String                                      *
* -phoneNumber: String                                  *
* -email: String                                        *
* +Person()                                             *
* +Person(newName: String, newAddress: String,          *
*  newPhoneNumber: String, newEmail: String)            *
* +setName(newName: String)                             *
* +getName(): String                                    *
* +setAddress(newAddress: String)                       *
* +getAddress(): String                                 *
* +setPhoneNumber(newPhoneNumber: String)               *
* +getPhoneNumber(): String                             *
* +setEmail(newEmail: String)                           *
* +getEmail(): String                                   *
* +toString(): String     
********************************************************/

public class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String email;

	public Person(){
		this.setName("");
		this.setAddress("");
		this.setPhoneNumber("");
		this.setEmail("");
	}
	
	public Person(String newName, String newAddress, String newPhoneNumber, String newEmail){
		this.setName(newName);
		this.setAddress(newAddress);
		this.setPhoneNumber(newPhoneNumber);
		this.setEmail(newEmail);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
    public String toString() {
        return this.getClass().getName() + // This will print the class name 
        		"\n\t" + "Name: " + name + 
        		"\n\t" + "Address: " + address + 
        		"\n\t" + "Phone Number: " + phoneNumber +
        		"\n\t" + "Email: " + email;
    }
		
}
