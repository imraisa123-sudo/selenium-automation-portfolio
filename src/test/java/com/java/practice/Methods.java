package com.java.practice;

public class Methods {

	public static void main(String[] args) {
		// why method some lines of code can be reuse in some places then we use method
		// we cant write method inside the main method

		Methods d = new Methods();
		String name = d.getData();
		System.out.println(name);
		
	   Methods2 d1 = new Methods2();
	   d1.getUserData();
	   getData2();

	}


	//method
	public String getData() 
	{
		System.out.println("Hello World");
		return "raisa shaik";

	}
	
	public static String getData2() 
	{
		System.out.println("Hello World");
		return null;

	}
}