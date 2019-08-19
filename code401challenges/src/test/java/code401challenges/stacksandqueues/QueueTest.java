package code401challenges.stacksandqueues;

import static org.junit.Assert.*;
import org.junit.Test;

public class QueueTest {

    @Test
    public void testQueue_instantiateQueue() {
        Queue<Integer> newQueue = new Queue<>(null,null, null);

        assertEquals("Empty queue should be instantiated", "Queue: FRONT<-null", newQueue.toString());
    }
    @Test
    public void testQueue_enqueueOneNode() {
        Queue<Integer> newQueue = new Queue<>(null,null, null);
        newQueue.enqueue(13);
        System.out.println(newQueue.toString());

        assertEquals("Empty queue should be instantiated", "Queue: FRONT<-13<-null", newQueue.toString());
    }

    @Test
    public void testQueue_enqueueMultipleNodes() {
        Queue<Integer> newQueue = new Queue<>(null,null, null);
        newQueue.enqueue(13);
        newQueue.enqueue(34);
        newQueue.enqueue(6);
        System.out.println(newQueue.toString());

        assertEquals("Empty queue should be instantiated", "Queue: FRONT<-13<-34<-6<-null", newQueue.toString());
    }

    @Test
    public void testQueue_dequeue
    @Test
    public void testQueue_peekEmpty() {
        Queue<Integer> newQueue = new Queue<>(null,null, null);

        assertEquals("The queue is empty so there should be a warning not to dequeue", "FRONT is null. Don't dequeue!", newQueue.peek());
    }

    @Test
    public void testQueue_dequeueUntilEmpty() {
        Queue<Integer> newQueue = new Queue<>(null,null, null);
        newQueue.enqueue(13);
        newQueue.enqueue(34);
        newQueue.enqueue(6);

        while(newQueue.front != null) {
            newQueue.dequeue();
        }

        assertEquals("The queue is empty so there should be a warning not to dequeue", "Queue: FRONT<-null", newQueue.toString());
    }
}
