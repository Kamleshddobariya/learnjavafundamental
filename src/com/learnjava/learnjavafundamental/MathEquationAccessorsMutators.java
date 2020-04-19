package com.learnjava.learnjavafundamental;

public class MathEquationAccessorsMutators {

    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    public void execute() {

        switch (opCode) {

            case 'a' :
                result = leftVal + rightVal;
                break;
            case 's' :
                result = leftVal - rightVal;
                break;
            case 'd' :
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("error - invalid");
                result = 0.0d;
                break;
        }

    }


}
