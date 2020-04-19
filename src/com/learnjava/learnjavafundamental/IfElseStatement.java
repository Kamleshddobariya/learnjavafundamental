package com.learnjava.learnjavafundamental;

public class IfElseStatement {

    public static void main(String[] args) {

        int v1 = 5;
        int v2 = 6;

        if (v1 > v2) {
            System.out.println("v1 is bigger");
        }
        else if(v1 < v2) {
            System.out.println("v2 is bigger");
        }
        else
            System.out.println("v1 and v2 are same");


    }
}
