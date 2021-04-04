package com.emilio;

public class MaxNumberFinder {
    public static void main(String[] args) {
        int[] a = {7,-2,6,21,10};
        int maxNumber = a[0];
        for(int num : a) {
            if(maxNumber < num) {
                maxNumber = num;
            }
        }
        System.out.println(maxNumber);
    }
}
