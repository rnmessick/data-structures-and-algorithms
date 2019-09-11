package code401challenges.quickSort;

public class QuickSort {

    public void quickSort(int[] arr, int left, int right) {
        left = arr[0];
        right = arr.length - 1;
        if (left < right) {
            // Partition the array by setting the position of the pivot value
            int position = partition(arr, left, right);
            // Sort the left
            if(position - 1 > left) {
                quickSort(arr, left, position - 1);
            }
            // Sort the right
            if(position + 1 < right) {
                quickSort(arr, position + 1, right);
            }
        }
    }

    public int partition(int[] arr, int left, int right) {
        // set a pivot value as a point of reference
        int pivot = arr[right];
        // create a variable to track the largest index of numbers lower than the defined pivot
        int low = left - 1;
        //    for i <- left to right do
        for (int i = left; i < right; i++) {
            if (arr[i] <= pivot) {
                low++;
                swap(arr, right, low);
            }
        }
        // place the value of the pivot location in the middle.
        // all numbers smaller than the pivot are on the left,
        // larger on the right.
        swap(arr, right, low + 1);
        // return the pivot index point
        return low + 1;
    }

    public void swap(int[] arr, int i, int low) {
        int temp;
        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }
}
