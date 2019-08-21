package code401challenges.utilities;

import code401challenges.stacksandqueues.Queue;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void testEnqueueAnimalShelter() {
        AnimalShelter testShelter = new AnimalShelter();
        Queue dog = new Queue<>();

        testShelter.enqueue(dog);
        testShelter.enqueue(dog);
        System.out.println(testShelter);

        assertEquals("Dog should be first out", dog, testShelter);
    }

    @Test
    public void dequeue() {
    }
}