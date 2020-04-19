package com.learnjava.learnjavafundamental;

public class LogicalOperator {

    public static void main(String[] args) {

        int a = 20;
        int b = 14;
        int c = 5;

        if (a > b & b > c) { // & means and

            System.out.println("a is greater than c");
        }

        int students = 150;
        int rooms = 0;

//        if(rooms > 0 & students/rooms > 30)

        if(rooms > 0 && students/rooms > 30)
            System.out.println("Crowded");


        System.out.println("end program");


    }
}

