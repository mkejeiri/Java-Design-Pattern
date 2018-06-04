package com.java.course;

public class InterpreterClient {
    private InterpreterContext interpreterContext;
    public InterpreterClient(InterpreterContext interpreterContext) {
        this.interpreterContext = interpreterContext;
    }
    public String interpret(String expr){
        Expression expression = null;
        if (expr.contains("Hexadecimal")){
            expression= new IntToHexExpression(
                    Integer.parseInt(expr.substring(0,expr.indexOf(" ")))
            );
        }else if (expr.contains("Binary")){
            expression= new IntToBinaryExpression(
                    Integer.parseInt(expr.substring(0, expr.indexOf(" ")))
            );
        } else return expr;
        return expression.interpret(interpreterContext);
    }
    public static void main(String[] args) {
        String f = "13 in Binary";
        String s = "20 in Hexadecimal";

        InterpreterClient interpreter = new InterpreterClient(new InterpreterContext());
        System.out.println(f+" = " +interpreter.interpret(f));
        System.out.println(s+" = " +interpreter.interpret(s));
    }
}
