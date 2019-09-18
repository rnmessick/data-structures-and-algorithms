package code401challenges.tree;

import code401challenges.stacksandqueues.Queue;

import java.util.ArrayList;

public class Tree<T> {

    public Node<T> root;

    public Tree() {
        this.root = null;
    }

    public Tree(Node<T> root) {
        this.root = root;
    }

    //refactored based on https://www.baeldung.com/java-binary-tree
    public ArrayList<T> preOrder() {
        return preOrder(this.root, new ArrayList<>());
    }

    private ArrayList<T> preOrder(Node<T> current, ArrayList<T> inputArr) {
        // root first
        if (current != null) {
            inputArr.add(current.value);
            preOrder(current.leftChild, inputArr);
            preOrder(current.rightChild, inputArr);
        }
        return inputArr;
    }

    public ArrayList<T> inOrder() {
        return inOrder(this.root, new ArrayList<>());
    }

    private ArrayList<T> inOrder(Node<T> current, ArrayList<T> inputArr) {
        if (current != null) {
            inOrder(current.leftChild, inputArr);
            inputArr.add(current.value);
            inOrder(current.rightChild, inputArr);
        }
        return inputArr;
    }

    public ArrayList<T> postOrder() {
        return inOrder(this.root, new ArrayList<>());
    }

    public ArrayList<T> postOrder(Node<T> current, ArrayList inPutArr) {
            if (current != null) {
            postOrder(current.leftChild, inPutArr);
            postOrder(current.rightChild, inPutArr);
            inPutArr.add(current.value);

        }
        return inPutArr;
    }

    public void breadthFirstTraversal() {
        if (root == null) {
            return;
        }
        Queue<Node> nodeQueue = new Queue<>();
        nodeQueue.enqueue(root);

        while (nodeQueue.peek() != null) {
            Node node = nodeQueue.dequeue();
            if (node.leftChild != null) {
                nodeQueue.enqueue(node.leftChild);
            }

            if (node.rightChild != null) {
                nodeQueue.enqueue(node.rightChild);

            }

        }
    }

//    public int findMaxValue(Node<T> treeNode) {
//        //where is the max?
//        //solving recursively
//        if (treeNode == null) {
//            int minValue = Integer.MIN_VALUE;
//            return minValue;
//        }
//        //might be node.value
//        T maxResult = treeNode.value;
//        //might be in the left subtree
//        T leftChildResult = treeNode.leftChild;
//        //might be in the right subtree
//        T rightChildResult = treeNode.rightChild;
//
//        //find the max from those three spots
//        if (treeNode.leftChild != null) {
//            maxResult = leftChildResult;
//        }
//
//        if (rightChildResult != null) {
//            maxResult = rightChildResult;
//        }
//        return (int) maxResult;
//    }
//
//
    public Node<T> getRoot() {
        return root;
    }
}

