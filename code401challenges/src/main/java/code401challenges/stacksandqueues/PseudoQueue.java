package code401challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class PseudoQueue<T> {
    Stack<T> stackOne;
    Stack<T> stackTwo;

    public PseudoQueue() {
        this.stackOne = new Stack<>();
        this.stackTwo = new Stack<>();
    }

    public void enqueue(T value) {
        this.stackOne.push(value);
    }

    public T dequeue() {
            this.stackTwo.push(this.stackOne.pop());

            return stackOne.peek();

    }

}