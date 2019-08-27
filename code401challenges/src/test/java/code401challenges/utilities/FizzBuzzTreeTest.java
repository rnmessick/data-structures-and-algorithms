package code401challenges.utilities;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    Tree fbTree;
    ArrayList<Object> answerArr;
    @Test
    public void setFbTreeTest() {
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
        fbTree = new Tree(nodes);

        answerArr = new ArrayList<>();
        answerArr.add("Fizz");
        answerArr.add(7);
        answerArr.add("Buzz");
        answerArr.add(2);
        answerArr.add(11);
        answerArr.add("FizzBuzz");
        System.out.println(answerArr);
        assertEquals("All 3's should be 'fizz', all 5's should be 'buzz', numbers divisable by 15 will be fizzbuzz", answerArr, FizzBuzzTree.fizzBuzzTree(fbTree));

    }
    @Test
    public void fizzBuzzTree() {




    }
}