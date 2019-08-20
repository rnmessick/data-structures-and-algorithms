package code401challenges.stacksandqueues;

import static org.junit.Assert.*;
import org.junit.Test;

public class QueueTest {

    @Test
    public void testQueue_instantiateQueue() {
        Queue<Integer> newQueue = new Queue<>(null,null);

        assertEquals("Empty queue should be instantiated", "Queue: FRONT<-null", newQueue.toString());
    }

    @Test
    public void testQueue_enqueueOneNode() {
        Queue<Integer> newQueue = new Queue<>(null,null);
        newQueue.enqueue(13);

        assertEquals("Front should be the value argument", "Queue: FRONT<-13<-null", newQueue.toString());
    }

    @Test
    public void testQueue_enqueueMultipleNodes() {
        Queue<Integer> newQueue = new Queue<>(null,null);
        newQueue.enqueue(13);
        newQueue.enqueue(34);
        newQueue.enqueue(6);

        assertEquals("Multiple values should be added with first value being front", "Queue: FRONT<-13<-34<-6<-null", newQueue.toString());
    }

    @Test
    public void testQueue_dequeue() {
        Queue<Integer> newQueue = new Queue<>(null,null);
        newQueue.enqueue(13);
        newQueue.enqueue(34);
        newQueue.enqueue(6);

        newQueue.dequeue();

        assertEquals("Front value should be dequeued", "Queue: FRONT<-34<-6<-null", newQueue.toString() );

    }

    @Test
    public void testQueue_peekEmpty() {
        Queue<Integer> newQueue = new Queue<>(null,null);

        assertEquals("The queue is empty so there should be a warning not to dequeue", "FRONT is null. Don't dequeue!", newQueue.peek());
    }

    @Test (expected = NullPointerException.class)
    public void testQueue_dequeueEmpty() {
        Queue<Integer> newQueue = new Queue<>(null,null);
        newQueue.dequeue();

        assertEquals("The queue is empty so there should be a warning not to dequeue", "FRONT is null. Don't dequeue!", newQueue.toString());
    }

    @Test
    public void testQueue_dequeueUntilEmpty() {
        Queue<Integer> newQueue = new Queue<>(null,null);
        newQueue.enqueue(13);
        newQueue.enqueue(34);
        newQueue.enqueue(6);

        while(newQueue.front != null) {
            newQueue.dequeue();
        }
        assertEquals("The queue is empty so there should be a warning not to dequeue", "Queue: FRONT<-null", newQueue.toString());
    }
}
