package com.bridgelabz.generics;
/*Problem Statement
 * UC - 1 Given 3 Integers find the maximum
 */
import java.util.Scanner;

public class TestMaximumIntegerNumber {
	// initialize variable
	int firstNumber, secondNumber, thirdNumber;
	/*
	 * create constructor
	 */
	public TestMaximumIntegerNumber(int firstNumber, int secondNumber, int thirdNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
	}
		//create method for testMaximum number.
	public static Integer testMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		Integer maximumNumber = firstNumber;// Initializing firstnumber as greater
		if (secondNumber.compareTo(maximumNumber) > 0)
			maximumNumber = secondNumber;// as of now secondnumber is greater

		if (thirdNumber.compareTo(maximumNumber) > 0)
			maximumNumber = thirdNumber;// now thirdnumber is greater
		printMax(firstNumber, secondNumber, thirdNumber, maximumNumber);
		return maximumNumber;
	}

	public static void printMax(Integer firstNumber, Integer secondNumber, Integer thirdNumber, Integer maximumNumber) {
		System.out.printf("The maximum number of %s , %s and %s is %s\n", firstNumber, secondNumber, thirdNumber,
				maximumNumber);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter second number: ");
		int secondNumber = scanner.nextInt();
		System.out.println("Enter third number: ");
		int thirdNumber = scanner.nextInt();
		testMaximum(firstNumber, secondNumber, thirdNumber);
		scanner.close();
	}

}
