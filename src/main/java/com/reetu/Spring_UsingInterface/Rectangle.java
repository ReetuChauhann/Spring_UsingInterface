package com.reetu.Spring_UsingInterface;

public class Rectangle implements Shape {
	private double ar;
	public void findArea() {
		ar=6*7;
	}

	public void printArea() {
		System.out.println("Rectangle's Area: "+ar);
	}

}
