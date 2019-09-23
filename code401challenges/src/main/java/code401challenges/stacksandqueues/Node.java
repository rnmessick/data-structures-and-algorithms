package code401challenges.stacksandqueues;

public class Node {

    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public Node getNext() {
        return this.next;
    }

    public int getData() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
