package code401challenges.mergeSort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {
    @Test
    public void mergeSortTest() {
        int[] testArr = {7, 3, 1, 5, 2, 6, 4};
        int[] expectedArr = {1, 2, 3, 4, 5, 6, 7};

        MergeSort.mergeSortRecursive(testArr, testArr.length);
        assertArrayEquals(expectedArr, testArr);
    }
}
