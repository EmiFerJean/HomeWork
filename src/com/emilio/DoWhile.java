package com.emilio;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner playAgain = new Scanner(System.in);
        System.out.println("Type 'exit' to leave.");
        String play;
        //statement
        do{
            System.out.println("Currently playing...");
            play = playAgain.nextLine();                //need to declare it again.
        //action

        } while (!play.equalsIgnoreCase("exit"));
        System.out.println("Stopped");
        //condition
    }
}