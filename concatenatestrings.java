package com.code;
import java.util.Scanner;
class concatenatestring
{
 public static void main(String[] args)
 {
  /*create Scanner class object*/
  Scanner sc = new Scanner(System.in);

  /*Display message for user to take first string input from the keyboard*/
  System.out.println("Enter first string:");
  String firstStr = sc.next();

  /*Display message for user to take first string input from the keyboard*/
  System.out.println("Enter second string ");
  String secondStr = sc.next();

  /* Display message for displaying result*/
  System.out.println("Result after concatenation:");

  /* '+' operator concatenate string*/
  System.out.println(firstStr + " " + secondStr);
 }
}

