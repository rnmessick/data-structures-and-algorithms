package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test
    public void testArrayShift() {
        assertArrayEquals("Insert element in center for even arrays", new int[]{1, 2, 5, 3, 4}, ArrayShift.arrayShift(new int[]{1, 2, 3, 4}, 5));
        assertArrayEquals("Insert element after middle element for odd length arrays", new int[]{1, 2, 3, 5, 4, 5}, ArrayShift.arrayShift(new int[]{1, 2, 3, 4, 5}, 5));


    }

    @Test
    public void testArrayShift_edgeCases() {
        assertArrayEquals("Should insert value in empty array", new int[]{5}, ArrayShift.arrayShift(new int[]{}, 5));
        assertArrayEquals("Should insert value in array with only one element", new int[]{4, 5}, ArrayShift.arrayShift(new int[]{4}, 5));

    }
}