package code401challenges.tree;

public class Node{
    int value;
    Node leftChild;
    Node rightChild;

    Node(int value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    public Node getRightNode() {
        return rightChild;
    }

    public Node getLeftNode() {
        return leftChild;
    }

    public Integer getValue() {
        return value;
    }
}
