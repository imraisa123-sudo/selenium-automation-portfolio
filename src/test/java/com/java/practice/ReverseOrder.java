package com.java.practice;

public class ReverseOrder {
    public static void main(String[] args) {

        int[] number = {1, 0, 5, 3, 2,10};

        // First element
        System.out.println(number[0]);

        // Last element (value)
        System.out.println(number[number.length - 1]);

        // Total number of elements
        int totalNumber = number.length;
        System.out.println(totalNumber);

        // Print elements in reverse order
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i] + " ");
        }
    }
}