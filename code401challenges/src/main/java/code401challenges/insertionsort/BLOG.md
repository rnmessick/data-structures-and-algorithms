# Blog Notes: Insertion Sort

Insertion sort is a sorting algorithm that works much like the way we might sort playing cards in our hands.

The time complexity for this is O(n^2) which is not very efficient.

## Learning Objectives

- Coming soon!

## Information Flow

- Coming soon!

## Diagram

**Coming Soon!**

## Algorithm

Coming soon!

## Pseudo Code

    InsertionSort(int[] arr)
    FOR i = 1 to arr.length

      int j <-- i - 1
      int temp <-- arr[i]

      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1

      arr[j + 1] <-- temp

## Readings and References

Readings

[Geeks for Geeks: Insertion Sort](https://www.geeksforgeeks.org/insertion-sort/)

[Baeldung Java InsertionSort](https://www.baeldung.com/java-insertion-sort)

Video

[Geeks for Geeks Youtube Video on Insertion Sort](https://www.youtube.com/watch?v=OGzPmgsI-pQ)
