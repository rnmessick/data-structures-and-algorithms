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

    public ArrayList<T> preOrder(Node<T> current, ArrayList arrList) {
        // root first
        arrList.add(current.value);
        if(current.leftChild != null) {
            preOrder(current.leftChild, arrList);
        }
        if(current.rightChild != null) {
            preOrder(current.rightChild, arrList);
        }
        return arrList;
    }

    public ArrayList inOrder(Node<T> node, ArrayList arrList) {

        if(node.leftChild != null) {
            inOrder(node.leftChild, arrList);
        }

        arrList.add(node.value);

        if(node.rightChild != null) {
            inOrder(node.rightChild, arrList);
        }
        return arrList;
    }

    public ArrayList postOrder(Node<T> node, ArrayList arrList) {

        if (node.leftChild != null) {
            postOrder(node.leftChild, arrList);
        }
        if (node.rightChild != null) {
            postOrder(node.rightChild, arrList);
        }
        arrList.add(node.value);

        return arrList;
    }

    public static ArrayList breadthFirstTraversal(Tree<Object> node) {
        ArrayList arrList = new ArrayList();
        Queue breadthSearchQ = new Queue();
        breadthSearchQ.enqueue(node);

        while (breadthSearchQ.peek() != null) {
            Node frontNode = new Node(breadthSearchQ.dequeue());

            if (frontNode.leftChild != null) {
                breadthSearchQ.enqueue(frontNode.leftChild);
            }

            if (frontNode.rightChild != null) {
                breadthSearchQ.enqueue(frontNode.rightChild);

            }
            arrList.add(breadthSearchQ);

        }
        return arrList;
    }


    public static Integer findMaxValue(Node treeNode) {
        if (treeNode == null) {
            return Integer.MIN_VALUE;
        }
        int maxResult = (int) treeNode.value;
        int leftChildResult = treeNode.leftChild;
        int rightChildResult = treeNode.rightChild;

        if (leftChildResult > maxResult) {
            maxResult = leftChildResult;
        }

        if (rightChildResult > maxResult) {
            maxResult = rightChildResult;
        }
        return maxResult;
    }



    public Node<T> getRoot() {
        return root;
    }

    @Override
    public String toString() {
        return this.root.toString();
    }
}
