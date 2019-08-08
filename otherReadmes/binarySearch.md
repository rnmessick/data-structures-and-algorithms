# Binary Search

Binary search in a sorted 1D array

## Challenge

Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist.

## Approach & Efficiency

Using a while loop, find the midpoint and check if it matches key. If too low, midpoint will now become the lowpoint. If too high, midpoint becomes max/high( or the new arr.length). If it matches, return midpoint index. If no match is found by end of array, return -1. Big O(logn)

## Solution

[Link to code](../code401challenges/src/main/java/code401challenges/BinarySearch.java)

[Link to tests](../code401challenges/src/test/java/code401challenges/BinarySearchTest.java)

![Image of Whiteboard Shift Insert Array](https://github.com/rnmessick/data-structures-and-algorithms/blob/master/assets/binarySearch.jpg)

## Resources

https://www.baeldung.com/java-binary-search

## Collaborators

Sapana Poudel
