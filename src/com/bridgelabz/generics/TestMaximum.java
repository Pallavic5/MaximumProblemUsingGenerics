package com.bridgelabz.generics;
/*
 * UC - 5 Extend the max method to take more than three parameters
 */
public class TestMaximum<T extends Comparable<T>> {
	private T firstNumber, secondNumber, thirdNumber;

		//constructor
	public TestMaximum(T firstNumber, T secondNumber, T thirdNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
	}

		//checking max of three Generic data
	public static <T extends Comparable<T>> T testMaximum(T... values) {
		T maximum = values[0];
		for (int i = 1; i < values.length; i++) {
			if (values[i].compareTo(maximum) > 0) {
				maximum = values[i];
			}
		}
		System.out.println("The maximum of following variables");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + "\t");
		}
		printMax(maximum);
		return maximum;
	}

	public static <T> void printMax(T maximum) {
		System.out.println("is\t" + maximum);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Check maximum of three variables");
		String x = "Jack", y = "King", z = "Queen";
		Integer a = 30, b = 93, c = 29;
		Float p = 1.23f, q = 2.2f, r = 0.2f;
		TestMaximum.<String>testMaximum(x, y, z);
		TestMaximum.<Integer>testMaximum(a, b, c);
		TestMaximum.<Float>testMaximum(p, q, r);
	}
}