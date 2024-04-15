package org.prograd;

import java.util.Scanner;

public class InputRainfallArray {
    Scanner scanner = new Scanner(System.in);
    int i, j;
    public int[][] getInputRainfallArray(int number_of_days, int number_of_cities) {
        int[][] inputRainfallArray = new int[number_of_days][number_of_cities];
        for (i = 0; i < number_of_days; i++) {
            for (j = 0; j < number_of_cities; j++) {
                inputRainfallArray[i][j] = scanner.nextInt();
            }
        }
        return inputRainfallArray;
    }
}