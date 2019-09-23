//package code401challenges.stacksandqueues;
//
//import org.junit.Test;
//
//import java.util.NoSuchElementException;
//
//import static org.junit.Assert.assertEquals;
//
//public class PseudoQueueTest {
//
//    @Test (expected = AssertionError.class)
//    public void testPseudoQueue_emptyStack() {
//        PseudoQueue<Integer> newPseudoQueue = new PseudoQueue<>();
//        newPseudoQueue.enqueue(13);
//        System.out.println(newPseudoQueue.stackOne.top.value);
//        assertEquals("should match the first item added", "13", newPseudoQueue.stackOne.top.value);
//    }
//
//    @Test
//    public void testPseudoQueue_testEnqueue() {
//        PseudoQueue<Integer> newPseudoQueue = new PseudoQueue<>();
//        newPseudoQueue.enqueue(13);
//        newPseudoQueue.enqueue(34);
//        System.out.println(newPseudoQueue.stackOne.toString());
//
//        assertEquals("Stack: TOP->34->13->null", newPseudoQueue.stackOne.toString());
//    }
//
//    @Test
//    public void testPseudoQueue_testDequeue() {
//        PseudoQueue<Integer> newPseudoQueue = new PseudoQueue<>();
//        newPseudoQueue.enqueue(13);
//        newPseudoQueue.enqueue(34);
//        newPseudoQueue.dequeue();
////        System.out.println(newPseudoQueue.stackOne.toString());
////        System.out.println(newPseudoQueue.stackTwo.toString());
//
//        assertEquals("Should return a peek at the top value of stackTwo", "13", newPseudoQueue.stackTwo.toString());
//    }
//}
