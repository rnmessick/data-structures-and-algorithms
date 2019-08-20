package code401challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class Stack<T> {
    Node<T> top;

    public Stack() {
        this.top = null;
    }

    public void push(T newValue) {
        Node<T> newNode = new Node<>(newValue);
        newNode.next = this.top;
        this.top = newNode;
    }

    public T pop() {
        Node<T> temp = this.top;
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
        Node<T> current = this.top;
        while (current != null) {
            result += "->" + current.getData();
            current = current.getNext();

        }
        result += "->null";
        return "Stack: " + result;
    }
}
