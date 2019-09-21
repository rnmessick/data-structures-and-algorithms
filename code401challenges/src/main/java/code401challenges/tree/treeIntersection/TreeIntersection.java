package code401challenges.tree.treeIntersection;

public class TreeIntersection {

    static class Node {
        int key;
        Node left, right;
    }

    static Node newNode(int element) {
        Node temp = new Node();
        temp.key = element;
        temp.left = null;
        temp.right = null;
        return temp;
    }
}
