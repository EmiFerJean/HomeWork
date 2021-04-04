package com.emilio;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {

        Scanner whichColor = new Scanner(System.in);
        System.out.println("Which is the light color?");
        String lightColor = whichColor.nextLine();


        switch (lightColor) {
            case "Green":
                System.out.println("Go");
                break;
            case "Yellow":
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow + Red":
                System.out.println("Get ready to go");
        }
    }
}