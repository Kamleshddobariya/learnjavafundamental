package com.learnjava.learnjavafundamental;

public class WhileLoop {

    public static void main(String[] args) {

        int kVal = 6;
        int factorial = 1;

        while (kVal > 1) {
            factorial *= kVal;
            kVal -= 1;
        }

        System.out.println(factorial);
    }
}
