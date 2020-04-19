package com.learnjava.learnjavafundamental;

public class SwitchStatements {

    public static void main(String[] args) {

        int iVal = 11;

        switch (iVal % 2) {
            case 0:
                System.out.println(iVal);
                System.out.println("is even");
                break;
            case 1:
                System.out.println(iVal);
                System.out.println("is odd");
                break;
            default:
                System.out.println("oops it broke");
                break;
        }

    }
}
