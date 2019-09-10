# Blog Notes: Merge Sort

Merge Sort is known to be one of the most efficient sorting algorithms as it utilizes the "divide and conquor" method. When solved, the time complexity will come to O(nLogn).

## Learning Objectives

Merge Sort: What is it? How does it work?

## Information Flow

Step 1 − if it is only one element in the list it is already sorted, return.

Step 2 − divide the list recursively into two halves until it can no more be divided.

Step 3 − merge the smaller lists into new list in sorted order.

## Diagram

<!-- Fully plan on making my own version of this but just want to have a good placeholder -->

![Borrowed from Geeks for Geeks](/assets/mergeSort.png)

## Algorithm

Divide the unsorted list into n sublists, each containing one element (a list of one element is considered sorted).

Repeatedly merge sublists to produce new sorted sublists until there is only one sublist remaining. This will be the sorted list.

## Pseudo Code

    ALGORITHM Mergesort(arr)
      DECLARE n <-- arr.length

      if n > 1
        DECLARE mid <-- n/2
        DECLARE left <-- arr[0...mid]
        DECLARE right <-- arr[mid...n]
        // sort the left side
        Mergesort(left)
        // sort the right side
        Mergesort(right)
        // merge the sorted left and right sides together
        Merge(left, right, arr)

    ALGORITHM Merge(left, right, arr)
      DECLARE i <-- 0
      DECLARE j <-- 0
      DECLARE k <-- 0

      while i < left.length && j < right.length
          if left[i] <= right[j]
              arr[k] <-- left[i]
              i <-- i + 1
          else
              arr[k] <-- right[j]
              j <-- j + 1

          k <-- k + 1

      if i = left.length
        set remaining entries in arr to remaining values in right
      else
        set remaining entries in arr to remaining values in left

## Readings and References

Readings

[Wikipedia Merge Sort](https://en.wikipedia.org/wiki/Merge_sort)

[Geeks for Geeks: Merge Sort](https://www.geeksforgeeks.org/merge-sort/)

[Baeldung Java Merge Sort](https://www.baeldung.com/java-merge-sort)

Video

[Geeks for Geeks Youtube Video on Merge Sort](https://www.youtube.com/watch?time_continue=1&v=JSceec-wEyw)
