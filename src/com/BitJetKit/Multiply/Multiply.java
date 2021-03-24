package com.BitJetKit.Multiply;
/*
 * Title: Multiply
 * @author: BitJetKit
 * Date: March 24, 2021
 * Purpose: Multiply 2 numbers
 */
public class Multiply {
	private double number1;
	private double number2;
	private double product;
	
	public double getNumber1() {
		return number1;
	}
	public void setNumber1(double number1) {
		this.number1 = number1;
	}
	public double getNumber2() {
		return number2;
	}
	public void setNumber2(double number2) {
		this.number2 = number2;
	}
	public void setProduct(double number1, double number2) {
		product = number1 + number2;
	}
	public void printProduct() {
		System.out.println("1st number = " + number1 + " 2nd number = " + number2 + " Product = " + product);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(number1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(number2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(product);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multiply other = (Multiply) obj;
		if (Double.doubleToLongBits(number1) != Double.doubleToLongBits(other.number1))
			return false;
		if (Double.doubleToLongBits(number2) != Double.doubleToLongBits(other.number2))
			return false;
		if (Double.doubleToLongBits(product) != Double.doubleToLongBits(other.product))
			return false;
		return true;
	}
}
