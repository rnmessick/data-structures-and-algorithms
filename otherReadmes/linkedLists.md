# Singly Linked List

Implement a Singly Linked List Data Structure

## Challenge

<!-- Description of the challenge -->
Build out a library of methods to instantiate and manipulate a linked list.

## Approach & Efficiency

<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

After building List and Node classes, and their constructors, write out tests to determine the code necessary for the desired results.

## Solution

![Image of Whiteboard: Append, InsertBefore, InsertAfter -Singly Linked Lists](https://github.com/rnmessick/data-structures-and-algorithms/blob/master/assets/linkedLists.jpg)


![Image of Whiteboard: Kth from end-Singly Linked Lists](https://github.com/rnmessick/data-structures-and-algorithms/blob/master/assets/linkedListsKth.JPG)

[Link to code](../code401challeneges/src/main/java/code401challenges/linkedLists)

[Link to tests](../code401challenges/src/test/java/code401challenges/linkedLists)



## API

<!-- Description of each method publicly available to your Linked List -->

**insert** which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.

**includes** which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.

**toString** which takes in no arguments and returns a string representing all the values in the Linked List.

**append** which adds a new node with the given value to the end of the list.

**insertBefore** which adds a new node with the given newValue immediately before the first value node

**insertAfter** which add a new node with the given newValue immediately after the first value node

**kthFromEnd** a method for the Linked List class which takes a number, k, as a parameter. Return the node’s value that is k from the end of the linked list.

**mergedList** which takes two linked lists as arguments. Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list.

\*\*

## Resources

https://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/

https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/

https://javarevisited.blogspot.com/2015/02/simple-junit-example-unit-tests-for-linked-list-java.html

https://stackoverflow.com/questions/19283083/printing-out-a-linked-list-using-tostring

https://farenda.com/algorithms/linked-list-add-element-at-the-end/

https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/

https://www.geeksforgeeks.org/nth-node-from-the-end-of-a-linked-list/

https://www.techiedelight.com/merge-alternate-nodes-two-linked-lists/

https://www.programcreek.com/2012/12/leetcode-merge-two-sorted-lists-java/
