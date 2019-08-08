package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void testBinarySearch_found() {
        assertTrue("Index is returned if key is in array", BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5}, 2) == 1);
    }
    @Test
    public void testBinarySearch_notFound() {
        assertTrue("Index is -1 if key is not found in array", BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5}, 8) == -1);
    }
    @Test
    public void testBinarySearch_emptyArray() {
        assertTrue("Index is -1 if array is empty", BinarySearch.binarySearch(new int[]{}, 8) == -1);
    }

}