/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
	 // ToDo 5: Fix the error
	 // ToDo 6: Fix the constructor of the Student class
	 // ToDo 8: The senior class should have a minimum of 85 credits
	 // ToDo 11: Add a toString method for the Senior class
	 // ToDo 12: Set the gpa of the student using the scanner and user
	 //  input and then print the output.
	 // ToDo 13: add comments and explain your code


/**
 * Create student objects
 */
	 Freshman std1 = new Freshman("James", (short) 20, 12);

	 Senior std2 = new Senior("John", (short) 30, 90);
/**
 * Create scanner for GPA
 */
	 java.util.Scanner scanner = new java.util.Scanner(System.in);

	 System.out.print("Enter GPA for Freshman James: ");
	 std1.setGpa(scanner.nextDouble());

	 System.out.print("Enter GPA for Senior John: ");
	 std2.setGpa(scanner.nextDouble());
/**
 * Output results
 */
	 System.out.println(std1);

	 System.out.println(std2);
 }

}


