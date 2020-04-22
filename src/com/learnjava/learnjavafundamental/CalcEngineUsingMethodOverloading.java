package com.learnjava.learnjavafundamental;

public class CalcEngineUsingMethodOverloading {

    public static void main(String[] args) {

        MathEquationUsingMethodOverloading[] equations = new MathEquationUsingMethodOverloading[4];
        equations[0] = new MathEquationUsingMethodOverloading('d',100,50);
        equations[1] = new MathEquationUsingMethodOverloading('a',25,92);
        equations[2] = new MathEquationUsingMethodOverloading('s',225,17);
        equations[3] = new MathEquationUsingMethodOverloading('m',11,3);

        for(MathEquationUsingMethodOverloading equation : equations) {

            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }

        System.out.println();
        System.out.println("Using Method Overloading");
        System.out.println();

        double leftDouble = 9.0;
        double rightDouble = 4.0;
        int leftInt = 9;
        int rightInt = 4;

        MathEquationUsingMethodOverloading equationOverload = new MathEquationUsingMethodOverloading('d');

        equationOverload.execute(leftDouble, rightDouble);
        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

        equationOverload.execute(leftInt, rightInt);
        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

        equationOverload.execute((double) leftInt, rightInt);
        System.out.print("result = ");
        System.out.println(equationOverload.getResult());
    }

}
