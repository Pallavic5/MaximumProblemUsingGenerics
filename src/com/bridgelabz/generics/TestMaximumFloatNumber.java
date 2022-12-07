package com.bridgelabz.generics;
/*
 * Problem Statement
 * UC - 2 Given 3 Floats find the maximum
 */
import java.util.Scanner;

public class TestMaximumFloatNumber {
	float firstNumber, secondNumber, thirdNumber;
	// Create Constructor
	public TestMaximumFloatNumber(float firstNumber, float secondNumber, float thirdNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
	}

	public static Float testMaximum(Float firstNumber, Float secondNumber, Float thirdNumber) {
		Float maximumNumber = firstNumber;// Initializing firstNumber as greater
		if (secondNumber.compareTo(maximumNumber) > 0)
			maximumNumber = secondNumber;// as of now secondNumber is greater

		if (thirdNumber.compareTo(maximumNumber) > 0)
			maximumNumber = thirdNumber;// now thirdNumber is greater
		printMax(firstNumber, secondNumber, thirdNumber, maximumNumber);
		return maximumNumber;

	}

	public static void printMax(Float firstNumber, Float secondNumber, Float thirdNumber, Float maximumNumber) {
		System.out.printf("The maximum number of %s , %s and %s is %s\n", firstNumber, secondNumber, thirdNumber,
				maximumNumber);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		float firstNumber = scanner.nextFloat();
		System.out.println("Enter second number: ");
		float secondNumber = scanner.nextFloat();
		System.out.println("Enter third number: ");
		float thirdNumber = scanner.nextFloat();
		testMaximum(firstNumber, secondNumber, thirdNumber);
		scanner.close();
	}

}
