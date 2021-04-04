package com.emilio;

public class ArgumentsPrinter {
    public static void main(String[] args){
        if (args.length == 0){
            System.out.println("You need at least one arg dummy!");
            System.exit(0);
        } else {
            for (String s : args){
                System.out.println(s);
            }
        }
    }
}