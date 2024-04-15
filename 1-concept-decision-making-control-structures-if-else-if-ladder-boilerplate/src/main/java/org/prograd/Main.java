package org.prograd;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Welcome to the Sales Commission Calculator System");
        System.out.println("-------------------------------------------------");
        System.out.println("Enter the Sales Made (in thousands):");
        Scanner scanner = new Scanner(System.in);
        double sales = scanner.nextDouble();
        TotalCommission commission = new TotalCommission();
        System.out.println("The Total Commission is:");
        if (commission.getTotalCommission(sales) == -1) {
            System.out.println("Please Enter a Valid Sales Input");
        } else {
            System.out.println(commission.getTotalCommission(sales));
        }
    }
}