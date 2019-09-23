# Breadth-First Traversal of a Graph

Implement a breadth-first traversal on a graph.

## Challenge
Extend your graph object with a breadth-first traversal method that accepts a starting node. 

Without utilizing any of the built-in methods available to your language, return a collection of nodes in the order they were visited. Display the collection.

## Approach & Efficiency

## Algorithm
From Codefellows:

Here is what the algorithm breadth first traversal looks like:

1. Enqueue the declared start node into the Queue.
2. Create a loop that will run while the node still has nodes present.
3. Dequeue the first node from the queue
4. if the Dequeue‘d node has unvisited child nodes, mark the unvisited children as visited and re-insert them back into the queue.

## Solution

## Resources

https://www.youtube.com/watch?v=0u78hx-66Xk

https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/