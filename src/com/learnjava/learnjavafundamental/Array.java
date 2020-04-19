package com.learnjava.learnjavafundamental;

public class Array {

    public static void main(String[] args) {

//        float[] theVals = new float[3];
//
//        theVals[0] = 1;
//        theVals[1] = 2;
//        theVals[2] = 3;

        float[] theVals = {10 , 20 , 30};
        float sum = 0;
        float sum1 = 0;

        //for loop
        for (int i = 0 ; i < theVals.length ; i++){
            sum += theVals[i];

        }
        System.out.println(sum);

        //for each loop for each array values
        for(float currentVals : theVals)
            sum1 += currentVals;
        System.out.println(sum1);
    }
}
