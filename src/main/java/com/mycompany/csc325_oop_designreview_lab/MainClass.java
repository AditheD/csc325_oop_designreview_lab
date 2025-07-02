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
	 // Todo 7: Create two classes for Freshman and Senior
	 // ToDo 8: The senior class should have a minimum of 85 credits
	 // ToDo 9: Add a toString method for the Student class
	 // ToDo 10: Add a toString method for the Freshman class
	 // ToDo 11: Add a toString method for the Senior class
	 // ToDo 12: Set the gpa of the student using the scanner and user
	 //  input and then print the output.
	 // ToDo 13: add comments and explain your code
/**
 * Constructing a Freshman with specified name, age, and credits.
 */
	 class Freshman extends Student {
		 public Freshman(String name, short age, int credits) {
			 super(name, age, credits);

		 }
		 @Override
		 public String toString() {
			 return "Freshman{" +
					 "name=" + getName() +
					 ", age=" + getAge() +
					 ", credits=" + getCredits() +
					 ", GPA=" + getGpa() +
					 '}';

		 }
	 }

	 /**
	  * A Senior student inherits from the Student class.
	  * A Senior must have at least 85 credits to be eligible.
	  * */

	 class Senior extends Student {
		 public Senior(String name, short age, int credits) {
			 super(name, age, credits);
			 if (credits < 85) {
				 throw new IllegalArgumentException("Senior must have at least 85 credits.");
			 }
		 }

		 @Override
		 public String toString() {
			 return "Senior{" +
					 "name=" + getName() +
					 ", age=" + getAge() +
					 ", credits=" + getCredits() +
					 ", GPA=" + getGpa() +
					 '}';
		 }
	 }
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


