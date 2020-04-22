package com.learnjava.learnjavafundamental;

public class PremitiveTypeParameter {

    public static void main(String[] args) {

        int val1 = 10;
        int val2 = 20;

        swap(val1,val2);
        System.out.println(val1);
        System.out.println(val2);


    }

    public static void swap(int i, int j) {

        int   k = i;
        i = j;
        j = k;

        System.out.println("Value of i = " + i);
        System.out.println("Value of j = " + j);
    }
}
