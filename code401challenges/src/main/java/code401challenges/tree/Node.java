package code401challenges.tree;

public class Node<T>{
    T value;
    Node<T> leftChild;
    Node<T> rightChild;

    public Node(T value) {
        this.value = null;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    public Node(T value, Node<T> leftChild, Node<T> rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    @Override
    public String toString() {
        return String.format("( %s %s %s )",
                this.leftChild == null ? "." : this.leftChild.toString(),
                this.value,
                this.rightChild == null ? "." : this.rightChild.toString());
    }
}
