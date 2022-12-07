package com.bridgelabz.generics;
/*
 * Problem Statement
 * Given 3 Strings find the maximum
 */
import java.util.Scanner;

public class TestMaximumString {
	String firstString, secondString, thirdString;

	// create Constructor
	public TestMaximumString(String firstString, String secondString, String thirdString) {
		super();
		this.firstString = firstString;
		this.secondString = secondString;
		this.thirdString = thirdString;
	}

	public static String testMaximum(String firstString, String secondString, String thirdString) {
		String maximumString = firstString;// Initializing firstString as greater
		if (secondString.compareTo(maximumString) > 0)
			maximumString = secondString;// as of now secondString is greater

		if (thirdString.compareTo(maximumString) > 0)
			maximumString = thirdString;// now thirdString is greater
		printMax(firstString, secondString, thirdString, maximumString);
		return maximumString;
	}

	public static void printMax(String firstString, String secondString, String thirdString, String maximumString) {
		System.out.printf("The maximum String of %s , %s and %s is %s\n", firstString, secondString, thirdString,
				maximumString);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String firstString = scanner.nextLine();
		System.out.println("Enter second String: ");
		String secondString = scanner.nextLine();
		System.out.println("Enter third String: ");
		String thirdNumber = scanner.nextLine();
		testMaximum(firstString, secondString, thirdNumber);
		scanner.close();
	}

}
