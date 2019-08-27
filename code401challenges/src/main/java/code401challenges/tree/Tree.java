package code401challenges.tree;

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

    public Node<T> getRoot() {
        return root;
    }

    @Override
    public String toString() {
        return this.root.toString();
    }
}
