package com.mycompany.csc325_oop_designreview_lab;

/**
 * A Senior student inherits from the Student class.
 * A Senior must have at least 85 credits to be eligible.
 * */
// Todo 7: Create two classes for Freshman and Senior

public class Senior extends Student {
	public Senior(String name, short age, int credits) {
		super(name, age, credits);
		if (credits < 85) {
			throw new IllegalArgumentException("Senior must have at least 85 credits.");
		}
	}
	// ToDo 11: Add a toString method for the Senior class

	@Override
	public String toString() {
		return "Senior(" +
				"Name=" + getName() +
				", Age=" + getAge() +
				", Credits=" + getCredits() +
				", GPA=" + getGpa() +
				')';
	}
}
