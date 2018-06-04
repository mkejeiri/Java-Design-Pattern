package com.java.course;

public class IntToHexExpression  implements Expression{
    private int a;

    public IntToHexExpression(int a) {
        this.a = a;
    }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getHexadecimalFormat(a);
    }
}
