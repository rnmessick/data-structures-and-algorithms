package code401challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class Stack<T> {
    Node top;

    public Stack() {
        this.top = null;
    }

    public void push(Node newValue) {
        Node newNode = new Node(newValue);
        newNode.next = this.top;
        this.top = newNode;
    }

    public int pop() {
        Node temp = this.top;
        this.top = top.next;
        temp.next = null;

        return temp.value;
    }

    public T peek() {
        if (top == null) {
            throw new NoSuchElementException("value is null. Do not pop!");
        } else {
            return (T) ("Top node is: " + top);
        }
    }

    public String toString() {
        String result = "TOP";
        Node current = this.top;
        while (current != null) {
            result += "->" + current.getData();
            current = current.getNext();

        }
        result += "->null";
        return "Stack: " + result;
    }

    public boolean isEmpty() {
        return length() == 0;
    }

    public int length() {
        int length = 0;
        Node current = top;

        while (current != null) {
            length++;

            current = current.next;
        }
        return length;
    }

    public void push(T root1) {
    }
}
