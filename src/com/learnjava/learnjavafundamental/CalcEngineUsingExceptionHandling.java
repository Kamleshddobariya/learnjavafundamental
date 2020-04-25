package com.learnjava.learnjavafundamental;

public class CalcEngineUsingExceptionHandling {

    public static void main(String[] args) {


        String[] statements;
        statements = new String[]{

                "add 1.0",
                "add xx 25.0",
                "addX 0.0 0.0",
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0",
        };

        CalculateHelperWithException helper = new CalculateHelperWithException();
        for(String statement:statements) {

            try {
                helper.processWithException(statement);
                System.out.println(helper);

            }catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if(e.getCause() != null)
                    System.out.println("Original exception: " + e.getCause().getMessage());
            }

        }
    }

}
