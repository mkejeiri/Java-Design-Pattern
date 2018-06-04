package com.java.course;

public class InterpreterContext {
    public InterpreterContext() {}
    public String getBinaryFormat(int i){return Integer.toBinaryString(i); }
    public String getHexadecimalFormat(int i){
        return Integer.toHexString(i);
    }
}
