package org.prograd;

public class Rate {
    double rate;

    public double getRate(double principal, int time) {
        if (principal < 25000) {
            rate = 6.0;
        } else {
            switch (time) {
                case 7:
                    rate = 7.0;
                    break;
                case 10:
                    rate = 8.5;
                    break;
                case 15:
                    rate = 9.5;
                    break;
                case 20:
                    rate = 12.5;
                    break;
                default:
                    rate = 6.75;
                    break;
            }
        }
        return rate;
    }
}