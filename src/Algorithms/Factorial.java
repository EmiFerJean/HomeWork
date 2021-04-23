package Algorithms;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {

        for (int n = 1; n <= 10; n++) {
            System.out.println(factorial(n));
        }
    }

    public static int factorial(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}