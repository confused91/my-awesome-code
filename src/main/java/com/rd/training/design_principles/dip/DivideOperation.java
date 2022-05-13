package com.rd.training.design_principles.dip;

public class DivideOperation implements CalculatorOperation{
    @Override
    public double calculate(double a, double b) {
        return a/b;
    }
}
