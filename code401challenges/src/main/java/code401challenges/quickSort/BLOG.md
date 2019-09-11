# Blog Notes: Quick Sort

Quick Sort utilizes the "divide and conquor" method. It picks an element as pivot and partitions the given array around the picked pivot.

Depending on the element chosen, this could be O(n^2) or O(n log(n))

## Learning Objectives

Quick Sort: What is it? How does it work?

## Information Flow

Choice of pivot matters:

## Diagram

![Quick Sort Diagram](/assets/quickSort.png)

Diagram by Znupi - Own work, Public Domain, https://commons.wikimedia.org/w/index.php?curid=6352260

## Algorithm

Step 1 − Pick an element, call it a pivot, from the array. Depending on your choice you can affect the algorithm's performance.

Step 2 − Partitioning: reorder the array so that all elements with values less than pivot are placed to the left and all elements with values greater than pivot are placed to the right.

Step 3 − Recursion! Step 1 and Step 2 are applied to the sub-arrays(one of smaller values and one of greater values)

## Pseudo Code

    ALGORITHM QuickSort(arr, left, right)
        if left < right
            // Partition the array by setting the position of the pivot value
            DEFINE position <-- Partition(arr, left, right)
            // Sort the left
            QuickSort(arr, left, position - 1)
            // Sort the right
            QuickSort(arr, position + 1, right)

    ALGORITHM Partition(arr, left, right)
        // set a pivot value as a point of reference
        DEFINE pivot <-- arr[right]
        // create a variable to track the largest index of numbers lower than the defined pivot
        DEFINE low <-- left - 1
        for i <- left to right do
            if arr[i] <= pivot
                low++
                Swap(arr, i, low)

         // place the value of the pivot location in the middle.
         // all numbers smaller than the pivot are on the left, larger on the right.
         Swap(arr, right, low + 1)
        // return the pivot index point
         return low + 1

    ALGORITHM Swap(arr, i, low)
        DEFINE temp;
        temp <-- arr[i]
        arr[i] <-- arr[low]
        arr[low] <-- temp

## Readings and References

Readings

[Wikipedia Quick Sort](https://en.wikipedia.org/wiki/Quicksort)

[Geeks for Geeks: Merge Sort](https://www.geeksforgeeks.org/quick-sort/)

[Baeldung Java Quick Sort](https://www.baeldung.com/java-quicksort)

Video

[Geeks for Geeks Youtube Video on Quick Sort](https://www.youtube.com/watch?time_continue=1&v=JSceec-wEyw)
