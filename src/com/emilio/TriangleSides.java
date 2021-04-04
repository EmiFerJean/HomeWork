package com.emilio;

import java.util.Scanner;

public class TriangleSides {
    public static void main(String[] args) {

        Scanner side = new Scanner(System.in);
        System.out.println("Provide three sides of a triangle. Side A:");
        double a = side.nextDouble();
        System.out.println("Side B:");
        double b = side.nextDouble();
        System.out.println("Side C:");
        double c = side.nextDouble();

        if( a + b <= c || b + c <= a || a + c <= b ) {
            System.out.println("Triangle can't be created with given parameters.");
        }
    }
}