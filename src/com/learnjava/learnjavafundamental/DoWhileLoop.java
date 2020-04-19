package com.learnjava.learnjavafundamental;

public class DoWhileLoop {

    public static void main(String[] args) {

        int kVal = 5;

        do {
            System.out.print(kVal);
            System.out.print(" * 2 = ");
            kVal *= 2;
            System.out.println(kVal);
        }
        while (kVal < 100);
    }
}
