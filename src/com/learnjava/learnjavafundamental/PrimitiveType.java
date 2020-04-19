package com.learnjava.learnjavafundamental;

public class PrimitiveType {

    public static void main(String[] args) {

        int firstValue = 100;
        int otherValue = firstValue;
        firstValue = 50;
        //otherValue = firstValue;

        System.out.println(firstValue);
        System.out.println(otherValue);
    }
}
