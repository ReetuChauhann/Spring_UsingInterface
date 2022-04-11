package com.reetu.Spring_UsingInterface;

public class Triangle implements Shape {
	private double ar;
	public void findArea() {
		ar=8*4/2;
	}
	public void printArea() {
		System.out.println("Triangle's Area: "+ar);
	}

}
