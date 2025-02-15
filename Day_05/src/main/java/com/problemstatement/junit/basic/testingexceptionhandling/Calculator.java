package com.problemstatement.junit.basic.testingexceptionhandling;

public class Calculator {
    public int divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("Division by Zero not Allowed");
        }
        return a/b;
    }

}
