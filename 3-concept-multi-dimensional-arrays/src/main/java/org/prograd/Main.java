package org.prograd;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Indian Meteorological Department");
        System.out.println("-----------------------------------------------");
        System.out.println("You are about to view the Rainfall Updates. Please keep Patience!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Days:");
        int number_of_days = scanner.nextInt();
        System.out.println("Enter the Number of Cities:");
        int number_of_cities = scanner.nextInt();
        InputsCollector inputsCollector = new InputsCollector();
        InputRainfallArray inputRainfallArray = new InputRainfallArray();
        System.out.println("Enter the Input Rainfall Array:");
        int[][] obtainedInputRainfallArray = inputRainfallArray.getInputRainfallArray(number_of_days, number_of_cities);
        System.out.println("The Maximum Rainfall Received Each Day is:");
        MaximumRainfall maximumRainfall = new MaximumRainfall();
        int[] obtainedMaximumRainfall = maximumRainfall.getMaximumRainfall(number_of_days, obtainedInputRainfallArray);
        System.out.println(Arrays.toString(obtainedMaximumRainfall));
    }
}