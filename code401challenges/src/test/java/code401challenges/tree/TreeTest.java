package code401challenges.tree;

import code401challenges.BinarySearch;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void setUp() throws Exception {
        ArrayList binaryTree = new ArrayList();
        assertTrue("New arraylist is empty", binaryTree.isEmpty());
        binaryTree.add(12);
        assertTrue(binaryTree.contains(12));
        binaryTree.add(18);
        binaryTree.add(6);
        binaryTree.add(13);
        binaryTree.add(3);
        assertTrue(binaryTree.contains(13));
        assertTrue(binaryTree.contains(6));
    }

    @Test
    public void testBreadthFirstTraversal() {
        //                3
        //               /  \
        //              7    11
        //             /        \
        //            5         15
        //          /
        //         2

        Node<Object> nodes = new Node<>(3,
                new Node<>(7, new Node<>(5, new Node<>(2,
                        null, null), null), null),
                new Node<>(11, new Node<>(15, null, null), null ));
        Tree<Object> bTree = new Tree<>(nodes);
        System.out.println(nodes.toString());

        assertEquals("Nodes should be printed out top down, left to right ",
                "( ( ( ( . 2 . ) Buzz . ) 7 . ) Fizz ( ( . FizzBuzz . ) 11 . ) )", Tree.breadthFirstTraversal(bTree).toString());
    }

}