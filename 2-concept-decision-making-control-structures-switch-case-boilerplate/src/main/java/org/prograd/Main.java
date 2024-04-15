package org.prograd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to XYZ Bank's Fixed Deposit Scheme");
        System.out.println("-------------------------------------------------");
        System.out.println("Enter the Principal Amount:");
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();
        System.out.println("Enter the Time:");
        int time = scanner.nextInt();

        Rate rate = new Rate();
        System.out.println("The Rate is:");
        double newRate = rate.getRate(principal, time);
        System.out.println(newRate);
        System.out.println("The Final Amount Payable will be Rs:");
        CompoundAmount compoundAmount = new CompoundAmount();
        System.out.println(compoundAmount.getCompoundAmount(principal, time, newRate));
        }
    }