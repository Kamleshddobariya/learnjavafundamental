package com.learnjava.mycalcapp;

import com.learnjava.learnjavafundamental.Adder;
import com.learnjava.learnjavafundamental.CalculateHelperWithException;
import com.learnjava.learnjavafundamental.DynamicHelper;
import com.learnjava.learnjavafundamental.InvalidStatementException;
import com.learnjava.learnjavafundamental.MathProcessing;
import com.learnjava.learnjavafundamental.PowerOf;

public class CalcEngineUsingInterface {

    public static void main(String[] args) {

        String[] statements;
        statements = new String[]{

                "add 25.0 75.0",
                "power 5.0 2.0",

        };

        DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
                new Adder(),
                new PowerOf(),
        });

        for(String statement:statements) {

            String output = helper.process(statement);
            System.out.println(output);
        }

    }

}
