package com.reetu.Spring_UsingInterface;

public class Circle implements Shape {
	private double ar;

	public void findArea() {
		ar=3.14*5*5;
	}

	public void printArea() {
		System.out.println("Circle's Area: "+ar);
	}
}
