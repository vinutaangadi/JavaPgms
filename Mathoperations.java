package com.code;
import java.util.Scanner;
public class Mathoperations {
    public static void main(String[] args) {
        //Create scanner class object
        Scanner in = new Scanner(System.in);

        //Input two numbers from user
        System.out.println("Enter the first number:");
        int num1 = in.nextInt();
        System.out.println("Enter the second number:");
        int num2 = in.nextInt();
        //Perform arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient= num1 / num2;
        int modulo = num1 % num2;

        //print result
        System.out.println("Sum:" + sum);
        System.out.println("Sum:" + sum);
        System.out.println("difference:" + difference);
        System.out.println("product:" + product);
        System.out.println("quotient:" + sum);
        System.out.println("modulo:" + sum);

    }
}







