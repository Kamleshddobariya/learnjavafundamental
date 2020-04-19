package com.learnjava.learnjavafundamental;

public class CalcEngineUsingArray {

    public static void main(String[] args) {
        double[] leftVals = {100, 25, 225, 11};
        double[] rightVals = {50, 92, 17, 3};
        char[] opCodes = {'d', 'a','s', 'm'};
        double[] results = new double[opCodes.length];

//        double val1 = 100.0d;
//        double val2 = 50.0d;
//        double result;
//        char opCode = 'd';;

        for(int i = 0 ; i < opCodes.length ; i++) {


            //add
            if (opCodes[i] == 'a')
                results[i] = leftVals[i] + rightVals[i];
//            result = val1 + val2;
            else if (opCodes[i] == 's')
                results[i] = leftVals[i] - rightVals[i];
//            result = val1 - val2;
            else if (opCodes[i] == 'd') {
                results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
//            if(val2 != 0.0d)
//            result = val1/val2;
//            else
//                result = 0.0d;
            } else if (opCodes[i] == 'm')
                results[i] = leftVals[i] * rightVals[i];
//            result = val1 * val2;
            else {
                System.out.println("error - invalid");
                results[i] = 0.0d;
            }

        }

        for(double theResult : results) {
            System.out.print("result = ");
            System.out.println(theResult);
        }
    }
}
