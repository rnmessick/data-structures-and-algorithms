package code401challenges.insertionsort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void insertionSOrtTest_sortsAscendingOrder() {
        int[] testArr = {13, 27, 6, 2, 3, 1};
        InsertionSort.insertionSort(testArr);
        int[] expectedArr = {1, 2, 3, 6, 13, 27};

        assertArrayEquals(expectedArr, testArr);
    }

}