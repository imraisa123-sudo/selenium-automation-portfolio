package com.java.practice;

public class StringOperations {

	public static void main(String[] args) {
		// String is an object that represents sequence of object
		
		//String literal
		//if same value then it considers it as same
		String name = "Miss Raisa Shaik";
		String name1 = "Miss Raisa Shaik";
		
		//another value of creating string
		
		String name2 = new String("Welcome");
		String name3 = new String("Home");
		
		// break string
		String s = "Lion Tiger Ant";
		String[] splittedString = s.split("Tiger");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		for(int i=0; i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
	

	}

}
