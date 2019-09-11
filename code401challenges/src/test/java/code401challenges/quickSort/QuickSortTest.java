package code401challenges.quickSort;

import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {

    @Test
    public void quickSortTest_sortHappy() {
        QuickSort quickSorter = new QuickSort();
        int[] testArr = {13, 27, 6, 2, 3, 1};
        int left = 0;
        int right = testArr.length-1;
        quickSorter.quickSort(testArr, left, right);

        System.out.println(Arrays.toString(testArr));

    }
//    @Test
//    public void insertionSortTest_negativeValues() {
//        int[] testArr = {13, -27, 6, -2, 3, 1};
//        InsertionSort.insertionSort(testArr);
//        int[] expectedArr = {-27,-2, 1, 3, 6, 13};
//
//        assertArrayEquals(expectedArr, testArr);
//    }

}