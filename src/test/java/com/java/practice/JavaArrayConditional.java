package com.java.practice;

public class JavaArrayConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number = {1,2,4,9,6,12,15,29};
		
		for(int i=0; i<number.length; i++) {
			
			//check if array has multiple of 2
			
			if(number[i] % 2==0) 
			{
			System.out.println(number[i]);
			break;
			}
			
			else 
			{
			 System.out.println(number[i] + "is not multiple of 2");
			}
		}
		

	}

}
