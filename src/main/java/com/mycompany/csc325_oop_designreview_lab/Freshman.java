package com.mycompany.csc325_oop_designreview_lab;

/**
 * Constructing a Freshman with specified name, age, and credits.
 */

// Todo 7: Create two classes for Freshman and Senior

public class Freshman extends Student {

	public Freshman(String name, short age, int credits) {
		super(name, age, credits);

	}
	// ToDo 10: Add a toString method for the Freshman class

	@Override
	public String toString() {
		return "Freshman(" +
				"Name=" + getName() +
				", Age=" + getAge() +
				", Credits=" + getCredits() +
				", GPA=" + getGpa() +
				')';

	}
}
