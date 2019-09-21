package code401challenges.tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree<T> {

    public static Node root;


    public Tree() {
        this.root = null;
    }

    public Tree(Node root) {
        this.root = root;
    }


    public void preOrder(Node current, ArrayList arrList) {
        // root first
        arrList.add(current.value);
        if(current.leftChild != null) {
            preOrder(current.leftChild, arrList);
        }
        if(current.rightChild != null) {
            preOrder(current.rightChild, arrList);
        }
    }

    public ArrayList inOrder(Node node, ArrayList arrList) {

        if(node.leftChild != null) {
            inOrder(node.leftChild, arrList);
        }

        arrList.add(node.value);

        if(node.rightChild != null) {
            inOrder(node.rightChild, arrList);
        }
        return arrList;
    }

    public ArrayList postOrder(Node node, ArrayList arrList) {

        if (node.leftChild != null) {
            postOrder(node.leftChild, arrList);
        }
        if (node.rightChild != null) {
            postOrder(node.rightChild, arrList);
        }
        arrList.add(node.value);

        return arrList;
    }

    public static ArrayList breadthFirstTraversal(Tree<Object> bTree) {
        if (root == null) {
            return null;
        }
        ArrayList arrList = new ArrayList();
        Queue nodes = new LinkedList();
        nodes.add(root);

        while (nodes.isEmpty()) {
            Node frontNode = (Node) nodes.remove();
            arrList.add(frontNode);
            if (frontNode.getLeftChild() != null) {
                nodes.add(frontNode.leftChild);
            }
            if (frontNode.getRightChild() != null) {
                nodes.add(frontNode.getRightChild());

            }
            arrList.add(frontNode.value);

        }
        return arrList;
    }

    public T findMaxValue(Node<T> treeNode) {
        //where is the max?
        //solving recursively
        if (treeNode == null) {
            return null;
        }
         //might be node.value
        T maxResult = treeNode.value;
        //might be in the left subtree
        Node<T> leftChildResult = treeNode.leftChild;
         //might be in the right subtree
        Node<T> rightChildResult = treeNode.rightChild;

        //find the max from those three spots
        if (treeNode.leftChild != null) {
            maxResult = leftChildResult.value;
        }

        if (rightChildResult != null) {
            maxResult = rightChildResult.value;
        }
        return  maxResult;
    }



    public Node<T> getRoot() {
        return root;
    }

    @Override
    public String toString() {
        return this.root.toString();
    }
}
