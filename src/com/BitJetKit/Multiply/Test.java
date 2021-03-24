package com.BitJetKit.Multiply;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		double userNumber;
		Multiply producer = new Multiply();
		Scanner reader = new Scanner(System.in);
		
		System.out.println("===============Add===============");
		System.out.println("Enter 2 numbers from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ".");
		
		System.out.println("\nEnter the 1st number: ");
		userNumber = reader.nextDouble();
		producer.setNumber1(userNumber);
		
		System.out.println("\nEnter the 2nd number: ");
		userNumber = reader.nextDouble();
		producer.setNumber2(userNumber);
		producer.setProduct(producer.getNumber1(), producer.getNumber2());
		producer.printProduct();
	}
}
