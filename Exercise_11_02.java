/** Program: Exercise 11.02
* File: Exercise_11_02.java
* Summary: Chapter 11, Exercise 02.  (The Person, Student, Employee, Faculty, and Staff classes)
* 
* Design a class named Person and its two subclasses named Student and Employee.
* Make Faculty and Staff subclasses of Employee. A person has a name,
* address, phone number, and email address. A student has a class status (freshman,
* sophomore, junior, or senior). Define the status as a constant. An employee has
* an office, salary, and date hired. Use the MyDate class defined in Programming
* Exercise 10.14 to create an object for date hired. A faculty member has office
* hours and a rank. A staff member has a title. Override the toString method in
* each class to display the class name and the person’s name.
* Draw the UML diagram for the classes and implement them. Write a test program
* that creates a Person, Student, Employee, Faculty, and Staff, and
* invokes their toString() methods.
* 
* Author: Aaron Fonseca
* Date: July 22, 2016
**/

public class Exercise_11_02 {

	public static void main(String[] args) {
		
		// Create a new objs
		Person NewPerson = new Person("Timmy Turner", "123 Fairytale Lane", "555-123-4567", "timmy@gmail.com" );
		Person NewStudent = new Student("Mickey Mouse", "123 Disney Lane", "555-789-5623", "mickey@gmail.com", 2 );
		Person NewEmployee = new Employee("Billy Smith", "897 West Smith Lane", "555-892-0005", "billy@gmail.com", 42, 45000 );
		Person NewFaculty = new Faculty("Willy Wonka", "856 Chocolate Lane", "123-986-5763", "candy4ever@gmail.com", 12, 65000, "Hours M-F: 7:30 - 4:30", "Master" );
		Person NewStaff = new Staff("Sallie Davis", "756 Bread Rd", "795-352-4756", "doughLover@gmail.com", 89, 35000, "Cookie Baker" );
		
		// Print out objs toString
		System.out.println(NewPerson.toString() +"\n" );	
		System.out.println(NewStudent.toString() +"\n" );	
		System.out.println(NewEmployee.toString() +"\n" );	
		System.out.println(NewFaculty.toString() +"\n" );	
		System.out.println(NewStaff.toString() +"\n" );	
	}
}