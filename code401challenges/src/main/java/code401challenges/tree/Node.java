package code401challenges.tree;

public class Node <T>{
    T value;
    public Node<T> leftChild;
    public Node<T> rightChild;

    public Node(T value) {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }


    @Override
    public String toString() {
        return String.format("( %s %s %s )",
                this.leftChild == null ? "." : this.leftChild.toString(),
                this.value,
                this.rightChild == null ? "." : this.rightChild.toString());
    }
}
