package com.learnjava.learnjavafundamental;

public class CalcEngineUsingFieldInitializerAndConstructor {

    public static void main(String[] args) {

        MathEquationUsingConstructor[] equations = new MathEquationUsingConstructor[4];
        equations[0] = new MathEquationUsingConstructor('d',100,50);
        equations[1] = new MathEquationUsingConstructor('a',25,92);
        equations[2] = new MathEquationUsingConstructor('s',225,17);
        equations[3] = new MathEquationUsingConstructor('m',11,3);

        for(MathEquationUsingConstructor equation : equations) {

            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }
    }

}
