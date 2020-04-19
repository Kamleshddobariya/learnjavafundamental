package com.learnjava.learnjavafundamental;

public class CalcEngineUsingClassMethodsAccessorsMutators {

    public static void main(String[] args) {

        MathEquationAccessorsMutators[] equations = new MathEquationAccessorsMutators[4];
        equations[0] = create(100,50,'d');
        equations[1] = create(25,92,'a');
        equations[2] = create(225,17,'s');
        equations[3] = create(11,3,'m');

        for(MathEquationAccessorsMutators equation : equations) {

            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }
    }

    public static MathEquationAccessorsMutators create(double leftVal, double rightVal, char opCode) {
        MathEquationAccessorsMutators equation = new MathEquationAccessorsMutators();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);

        return equation;
    }
}
