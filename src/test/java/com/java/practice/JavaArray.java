package com.java.practice;


public class JavaArray {

	public static void main(String[] args) {

		// Array 1 (int)
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] =2;
		arr[2] =3;
		arr[3] =4;
		arr[4] =5;
		//System.out.println(arr[3]);

		//Array 2 (int)
		int[] arr2 = {1,5,6,4};
		//System.out.println(arr2[3]);

		//for loop

		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);

		}

		//for loop 2
		
		String[] name = {"Raisa", "Shaik", "Rich"};

		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
		// for loop 3
		
		String[] animal = {"cat","rat","ant","dog","hen"};
		for ( String s : animal)
		{
			System.out.println(s);
		}
	}

}


