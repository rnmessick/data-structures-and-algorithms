package code401challenges.tree;

import java.util.ArrayList;

public class Tree {

    Node root;

    public Tree(Node root) {
        this.root = null;
    }

    public ArrayList preOrder(Node node, ArrayList arrList) {
        // root first
        arrList.add(node.value);
        if(node.leftChild != null) {
            preOrder(node.leftChild, arrList);
        }
        if(node.rightChild != null) {
            preOrder(node.rightChild, arrList);
        }
        return arrList;
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

}
