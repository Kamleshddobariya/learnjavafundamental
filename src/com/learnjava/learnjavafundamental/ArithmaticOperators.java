package com.learnjava.learnjavafundamental;

import java.net.StandardSocketOptions;

public class ArithmaticOperators {

    public static void main(String[] args) {

        int a = 50;
        int b = 10;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        int myVal = 50;
        myVal += 5;
        System.out.println(myVal);

        myVal -= 10;
        System.out.println(myVal);

        myVal *= 10;
        System.out.println(myVal);

        myVal %= 10;
        System.out.println(myVal);

        int result = 100;
        int val1 = 5;
        int val2 = 10;

        result /= val1 * val2;
        System.out.println(result);


    }
}
