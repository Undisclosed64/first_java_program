package com.tahera;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int output = num1 + num2;
        System.out.println("The sum is " + output);
    }
}
