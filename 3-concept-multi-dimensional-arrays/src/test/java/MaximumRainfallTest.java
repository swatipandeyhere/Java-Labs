import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.prograd.MaximumRainfall;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MaximumRainfallTest {
    MaximumRainfall maximumRainfall;

    @BeforeEach
    void init(){
        maximumRainfall = new MaximumRainfall();
    }

    @Test
    void shouldReturnMaximumWhenOneCrossOneArrayIsGiven(){
        int[][] intermediateArray = {{55}};
        int[] expectedArray = {55};
        int[] actualArray = maximumRainfall.getMaximumRainfall(1, intermediateArray);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void shouldReturnMaximumWhenTwoCrossTwoArrayIsGiven(){
        int[][] intermediateArray = {{123, 34}, {65, 84}};
        int[] expectedArray = {123, 84};
        int[] actualArray = maximumRainfall.getMaximumRainfall(2, intermediateArray);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void shouldReturnMaximumWhenOneCrossTwoArrayIsGiven(){
        int[][] intermediateArray = {{123, 34}};
        int[] expectedArray = {123};
        int[] actualArray = maximumRainfall.getMaximumRainfall(1, intermediateArray);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void shouldReturnMaximumWhenTwoCrossOneArrayIsGiven(){
        int[][] intermediateArray = {{123}, {34}};
        int[] expectedArray = {123, 34};
        int[] actualArray = maximumRainfall.getMaximumRainfall(2, intermediateArray);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void shouldReturnMaximumWhenThreeCrossThreeArrayIsGiven(){
        int[][] intermediateArray = {{123, 55, 65}, {34, 99, 12}, {45, 9, 2}};
        int[] expectedArray = {123, 99, 45};
        int[] actualArray = maximumRainfall.getMaximumRainfall(3, intermediateArray);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void shouldReturnMaximumWhenThreeCrossTwoArrayIsGiven(){
        int[][] intermediateArray = {{123, 55}, {34, 99}, {45, 9}};
        int[] expectedArray = {123, 99, 45};
        int[] actualArray = maximumRainfall.getMaximumRainfall(3, intermediateArray);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void shouldReturnMaximumWhenTwoCrossThreeArrayIsGiven(){
        int[][] intermediateArray = {{123, 55, 13}, {34, 99, 53}};
        int[] expectedArray = {123, 99};
        int[] actualArray = maximumRainfall.getMaximumRainfall(2, intermediateArray);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void shouldReturnMaximumWhenThreeCrossOneArrayIsGiven(){
        int[][] intermediateArray = {{123}, {34}, {65}};
        int[] expectedArray = {123, 34, 65};
        int[] actualArray = maximumRainfall.getMaximumRainfall(3, intermediateArray);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void shouldReturnMaximumWhenOneCrossThreeArrayIsGiven(){
        int[][] intermediateArray = {{123, 34, 65}};
        int[] expectedArray = {123};
        int[] actualArray = maximumRainfall.getMaximumRainfall(1, intermediateArray);
        assertArrayEquals(expectedArray, actualArray);
    }
}