package com.java.course;

public class IntToBinaryExpression implements  Expression {
    private int a;

    public IntToBinaryExpression(int a) {
        this.a = a;
    }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getBinaryFormat(a);
    }
}
