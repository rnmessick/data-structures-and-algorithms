package code401challenges.stacksandqueues;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testNewEmptyStack() {
        Stack<Integer> newStack = new Stack();

        assertEquals("Should instantiate an empty stack", "Stack: HEAD->null", newStack.toString());
    }

    @Test
    public void testStack_pushOne() {
        Stack<Integer> newStack = new Stack<>();
        newStack.push(13);

        assertEquals("Should push the value to the top of the stack and reassign top to new value", "Stack: HEAD->13->null", newStack.toString());
    }
    @Test
    public void testStack_pushMany() {
        Stack<Integer> newStack = new Stack<>();
        newStack.push(3);
        newStack.push(7);
        newStack.push(13);

        assertEquals("Should push the value to the top of the stack and reassign top to new value", "Stack: HEAD->13->7->3->null", newStack.toString());
    }

    @Test
    public void testStack_pop() {
        Stack<Integer> newStack = new Stack<>();
        newStack.push(3);
        newStack.push(13);

        int saved = newStack.pop();

        assertEquals("Should pop the top value and return it", 13, saved);
    }

    @Test (expected = NullPointerException.class)
    public void testStack_popNull() {
        Stack<Integer> newStack = new Stack<>();
        int saved = newStack.pop();

        assertEquals("Should return a warning message not to pop.", "value is null. Do not pop!", saved);
    }

    @Test
    public void testStack_popUntilEmpty() {
        Stack<Integer> newStack = new Stack<>();
        newStack.push(3);
        newStack.push(13);
        while (newStack.top != null) {
            newStack.pop();
        }

        assertEquals("Should keeping popping until it's empty", "Stack: TOP->null", newStack.toString());
    }

    @Test (expected = NoSuchElementException.class)
    public void testStack_peekNull() {
        Stack<Integer> newStack = new Stack<>();

        assertEquals("Should return a warning message not to pop.", "value is null. Do not pop!", newStack.peek());
    }

}
