/** Program: Exercise 11.17
* File: Exercise_11_17.java
* Summary: (Algebra: perfect square)
* 
* Write a program that prompts the user to enter an integer 
* m and find the smallest integer n such that m * n is a 
* perfect square. (Hint: Store all smallest variables of m 
* into an array list. n is the product of the variables that 
* appear an odd number of times in the array list. 
* For example, consider m = 90, store the variables 
* 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number 
* of times in the array list. So, n is 10.) 
*
* Author: Aaron Fonseca
* Date: July 22, 2016
**/

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_17 {

    public static void main(String[] args) {
    	
    	// Create Scanner
    	Scanner input = new Scanner(System.in);
    	
    	// Prompt User
        System.out.print("Enter an integer m: ");
        
        int m = input.nextInt();
        
        // Create Array List
        ArrayList<Integer> variables = new ArrayList<>();

        // Get Divisions of m
        getVariables(m, variables);

        int smallestVariable = smallestVariable(variables);
        System.out.println("The smallest number n for m * n to be a perfect square is " + smallestVariable);
        System.out.println("m * n = " + (m * smallestVariable));
    }

    private static int smallestVariable(ArrayList<Integer> variables) {

        int[][] occurrences = copy(variables);
        for (int i : variables) {
            search(occurrences, i);
        }

        // Remove doubles and get odd sequence variables
        ArrayList<Integer> oddVariables = removeDoubles(occurrences);

        // Get smallest variable
        int smallestVariable = 1;
        for (int i : oddVariables) {
            smallestVariable *= i;
        }
        return smallestVariable;
    }

    private static ArrayList<Integer> removeDoubles(int[][] m) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < m.length; i++) {
            if (m[i][1] % 2 != 0) {
                temp.add(m[i][0]);
            }
        }

        // Remove doubles
        ArrayList<Integer> duplicateDropped = new ArrayList<>();
        for (int i = 0; i < temp.size(); i++) {

            if (!duplicateDropped.contains(temp.get(i))) {
                duplicateDropped.add(temp.get(i));
            }
        }
        return duplicateDropped;
    }

    private static void search(int[][] m, int number) {
        for (int i = 0; i < m.length; i++) {
            if (m[i][0] == number) {
                m[i][1]++;
            }
        }
    }

    // Copy Variables into int Array
    private static int[][] copy(ArrayList<Integer> variables) {
        int[][] temp = new int[variables.size()][2];
        for (int i = 0; i < temp.length; i++) {
            temp[i][0] = variables.get(i);
        }
        return temp;
    }

    // Find Divisions of Variables
    private static void getVariables(int m, ArrayList<Integer> variables) {
        int count = 2;
        while (count <= m) {
            if (m % count == 0) {
                variables.add(count);
                m = m/count;
            } else {
                count++;
            }
        }
    }

}