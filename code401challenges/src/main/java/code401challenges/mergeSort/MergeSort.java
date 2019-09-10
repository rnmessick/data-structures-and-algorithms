package code401challenges.mergeSort;

public class MergeSort {
    public static void mergeSortRecursive(int[] inputArr, int n) {
        n = inputArr.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        //intelliJ suggested I try this instead of a for loop *shoulder shrug*
        for(int i =0; i < mid; i++) {
            left[i] = inputArr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = inputArr[i];
        }
            // sort the left side
            mergeSortRecursive(left, mid);
            // sort the right side
            mergeSortRecursive(right, n - mid);
            // merge the sorted left and right sides together
            mergeHelper(inputArr, left, right, mid, n - mid);

    }

    private static void mergeHelper(int[] inputArr, int[] leftTemp, int[] rightTemp, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left && j < right) {
            if (leftTemp[i] <= rightTemp[j]) {
                inputArr[k++] = leftTemp[i++];
            } else {
                inputArr[k++] = rightTemp[j++];
            }
        }
        while (i < left) {
            inputArr[k++] = leftTemp[i++];
        }
        while (j < right) {
            inputArr[k++] = rightTemp[j++];
        }

    }

}
