package com.learnjava.learnjavafundamental;

public class CalcEngineUsingInheritance {

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
        System.out.println("Using Inheritance");
        System.out.println();

        CalculateBase[] calculators = {

                new Division(100.0d, 50.0d),
                new Adder(25.0d, 92.0d),
                new Subtractor(225.0d, 17.0d),
                new Multiplier(11.0d, 3.0d),

        };

        for(CalculateBase calculator:calculators) {
            calculator.calculate();
            System.out.print("result = ");
            System.out.println(calculator.getResult());
        }
    }

}
