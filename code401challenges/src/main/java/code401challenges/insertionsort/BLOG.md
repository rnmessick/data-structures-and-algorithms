# Blog Notes: Insertion Sort

Insertion sort is a sorting algorithm that works much like the way we might sort playing cards in our hands.

The time complexity for this is O(n^2) which is not very efficient.

## Learning Objectives

What is insertion Sort? When should we use it?

## Information Flow

Insertion sort: A very simple algorithm used for sorting. If you think of it like sort a hand of cards, it works much the same way.

Uses: Insertion sort is used for either a small array or if the array is sorted or nearly sorted, it's short but in its worst case, takes n^2 time.

Much like someone asking you to sort an entire deck of cards in your hands, you could probably do it, it's just going to take a while.

Insertion Sort does not utilize a recursive method.

## Algorithm & Diagram

![Created by Renee Messick](/assets/insertionSort.png)

## Pseudo Code

    InsertionSort(int[] arr)
    FOR i = 1 to arr.length

      int j <-- i - 1
      int temp <-- arr[i]

      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1

      arr[j + 1] <-- temp

## Code

[Solution](/InsertionSort.java)

## Readings and References

Readings

[Geeks for Geeks: Insertion Sort](https://www.geeksforgeeks.org/insertion-sort/)

[Baeldung Java InsertionSort](https://www.baeldung.com/java-insertion-sort)

Video

[CodeArchery Animated Video](https://www.youtube.com/watch?v=uMqVuEEWJv4&t=263s)

[Geeks for Geeks Youtube Video on Insertion Sort](https://www.youtube.com/watch?v=OGzPmgsI-pQ)
