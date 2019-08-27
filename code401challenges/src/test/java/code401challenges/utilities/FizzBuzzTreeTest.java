package code401challenges.utilities;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    FizzBuzzTree fbTree;
    @Before
    public void setFbTreeTest() {
        //                3
        //               /  \
        //              7    11
        //             /        \
        //            5         15
        //          /
        //         2

        Node<Object> nodes = new Node<Object>(3, new Node<Object>(7, new Node<>(5, new Node<>(2, null, null), null), null), new Node<>(11, new Node<>(15, null, null), null ));
        fbTree = new FizzBuzzTree(nodes);
    }
    @Test
    public void fizzBuzzTree() {
        ArrayList answerArr = new ArrayList();

        assertEquals("All 3's should be 'fizz', all 5's should be 'buzz', numbers divisable by 15 will be fizzbuzz", "Fizz, 7, Buzz, 2, 11, FizzBuzz", answerArr);

    }
}