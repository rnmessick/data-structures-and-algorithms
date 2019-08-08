package code401challenges;

public class BinarySearch {
    public static int binarySearch(int[] sortedArray, int key) {
        int low = 0;
        int max = sortedArray.length -1;
        // Thank to Nick Paro for suggesting the while loop
        while ((max - low) > 0) {
            int midpoint = (low + max) / 2;
            // Adapted this from https://www.baeldung.com/java-binary-search
            if (sortedArray[midpoint] < key) {
                low = midpoint + 1;
            } else if (sortedArray[midpoint] > key) {
                max = midpoint - 1;
            } else if (sortedArray[midpoint] == key) {
                return midpoint;
            }
        }
        // Check that sortedArray is not empty and for the key to not be in it
        if (sortedArray.length > 0 && sortedArray[low] == key) {
            return low;
        } else {
            return -1;
        }
    }

}
