package com.learnjava.learnjavafundamental;

public class CalcEngine {

    public static void main(String[] args) {
        double val1 = 100.0d;
        double val2 = 50.0d;
        double result;
        char opCode = 'd';;


        //add
        if(opCode == 'a')
            result = val1 + val2;
        else if(opCode == 's')
            result = val1 - val2;
        else if(opCode == 'd') {
            result = val2 != 0.0d ? val1 / val2 : 0.0d;
//            if(val2 != 0.0d)
//            result = val1/val2;
//            else
//                result = 0.0d;
        }
        else if(opCode == 'm')
            result = val1 * val2;
        else {
            System.out.println("error - invalid");
            result = 0.0d;
        }
        System.out.println(result);




    }
}
