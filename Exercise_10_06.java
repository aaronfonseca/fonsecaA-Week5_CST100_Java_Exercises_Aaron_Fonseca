/** Program: Exercise 10.06
* File: Exercise10_06.java
* Summary: (Displaying the prime numbers)
* 
* (Displaying the prime numbers) Write a program that displays all the prime
* numbers less than 120 in decreasing order. Use the StackOfIntegers class
* to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in
* reverse order.
* 
* Author: Aaron Fonseca
* Date: July 20, 2016
**/

public class Exercise_10_06 {

    public static void main(String[] args) {

    	StackOfIntegers stack = new StackOfIntegers();

		// Push all prime numbers less than 120 to stack
		for (int i = 2; i < 120; i++) {
			if (isPrime(i)) // Send to isPrime Method
				stack.push(i);
		}

		// Displays all the prime numbers less than 120 in decreasing order
		System.out.println("All the prime numbers less than 120 in decreasing order:");
		
		// Display all numbers
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}

	// Return true if n is a prime number
	public static boolean isPrime(int n) {
		for (int d = 2; d <= n / 2; d++) {
			if (n % d == 0) 
				return false;
		}
		return true;
	}
}