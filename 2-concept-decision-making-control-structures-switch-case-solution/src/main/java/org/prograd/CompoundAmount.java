package org.prograd;

public class CompoundAmount {
    double compoundAmount;
    public double getCompoundAmount(double principal, int time, double rate) {
        compoundAmount = principal * Math.pow((1 + rate/100), time);
        return compoundAmount;
    }
}