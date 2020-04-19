package com.learnjava.learnjavafundamental;

public class CalcEngineUsingSwitch {

    public static void main(String[] args) {
        double[] leftVals = {100, 25, 225, 11};
        double[] rightVals = {50, 92, 17, 3};
        char[] opCodes = {'d', 'a','s', 'm'};
        double[] results = new double[opCodes.length];

        //just learned
        for(int i = 0 ; i < opCodes.length ; i++) {

            switch (opCodes[i]) {

                case 'a' :
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's' :
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'd' :
                    results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                default:
                    System.out.println("error - invalid");
                    results[i] = 0.0d;
                    break;
            }

        }

        for(double theResult : results) {
            System.out.print("result = ");
            System.out.println(theResult);
        }
    }
}
