package com.emilio;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Type a number:");
        String str = inputNumber.nextLine();

        double dnum = Double.parseDouble(str);
        dnum = Integer.parseInt(args[0]);
        System.out.println(dnum);

//Converting String into int using Integer.parseInt()
//        System.out.println(s+100);//200100, because "200"+100, here + is a string concatenation operator
//        System.out.println(i);//300, because 200+100, here + is a binary plus operator
    }
}
//        double doubleNumber = Double.parseDouble("1.23");
//        doubleNumber = Double.parseDouble(args[0]);
//
//        Scanner inputName = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Hello. Please input your name.");
//
//                String givenName = inputName.nextLine();  // Read user input
//                System.out.println("Nice to meet you, " + givenName + "!");  // Output user input

//          int integerNumber = Integer.parseInt("123");
//          integerNumber = Integer.parseInt(args[0]);