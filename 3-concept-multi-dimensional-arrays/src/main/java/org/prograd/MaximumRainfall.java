package org.prograd;

public class MaximumRainfall {
    public int[] getMaximumRainfall(int number_of_days, int[][] obtainedInputRainfallArray) {
        int i = 0;
        int maximumRainfall = 0;
        int[] result = new int[number_of_days];
        while (i < number_of_days) {
            for (int j = 0; j < obtainedInputRainfallArray[i].length; j++) {
                if (obtainedInputRainfallArray[i][j] > maximumRainfall) {
                    maximumRainfall = obtainedInputRainfallArray[i][j];
                }
            }
            result[i] = maximumRainfall;
            maximumRainfall = 0;
            i++;
        }
        return result;
    }
}