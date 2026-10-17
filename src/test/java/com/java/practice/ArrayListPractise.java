package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractise {

	public static void main(String[] args) {
		// in arraylist we use add
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Raisa");
		a.add("Shaik");
		a.add("Selenium");
		
        System.out.println(a.get(2));
        
        for(int i=0; i<a.size();i++) {
        	 System.out.print(a.get(i) + " ");
        	
        }
        
        for(String s : a) {
        	System.out.println(s);
        }
        
// item is present in arraylist
        
        System.out.println(a.contains("Raisa"));
        
        
// convert array to arraylist
        
        String[] fruit = {"Apple","Banana","Mango"};
        List<String> fruitArrayList = Arrays.asList(fruit);
        fruitArrayList.contains("Banana");
	}

}


//Arraylist - size
//Array - length
