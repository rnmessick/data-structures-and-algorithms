//package code401challenges.utilities;
//
//import code401challenges.tree.Node;
//import code401challenges.tree.Tree;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import static org.junit.Assert.*;
//
//public class FizzBuzzTreeTest {
//
//
//    ArrayList<Object> answerArr;
//    @Test
//    public void setFbTreeTest() {
//        //                3
//        //               /  \
//        //              7    11
//        //             /        \
//        //            5         15
//        //          /
//        //         2
//
//        Node<Object> nodes = new Node<>(3,
//                new Node<>(7, new Node<>(5, new Node<>(2,
//                        null, null), null), null),
//                new Node<>(11, new Node<>(15, null, null), null ));
//        Tree<Object> fbTree = new Tree(nodes);
////        System.out.println(fbTree.toString());
//
//        assertEquals("All 3's should be 'fizz', all 5's should be 'buzz', numbers divisable by 15 will be fizzbuzz",
//                "( ( ( ( . 2 . ) Buzz . ) 7 . ) Fizz ( ( . FizzBuzz . ) 11 . ) )",
//                FizzBuzzTree.fizzBuzzTree(fbTree).toString());
//
//    }
//    @Test
//    public void testFizzBuzzTree_noFizz() {
//        Node<Object> nodes = new Node<>(4,
//                new Node<>(5, new Node<>(2,
//                        null, null), null),
//                new Node<>(11, new Node<>(15, null, null), null));
//        Tree<Object> fbTree = new Tree(nodes);
////        System.out.println(fbTree.toString());
//
//        assertEquals("No fizzes.all 5's should be 'buzz', numbers divisable by 15 will be fizzbuzz",
//                "( ( ( . 2 . ) Buzz . ) 4 ( ( . FizzBuzz . ) 11 . ) )",
//                FizzBuzzTree.fizzBuzzTree(fbTree).toString());
//    }
//    @Test
//    public void testFizzBuzzTree_noBuzz() {
//        Node<Object> nodes = new Node<>(4,
//                new Node<>(3, new Node<>(6,
//                        null, null), null),
//                new Node<>(11, new Node<>(15, null, null), null));
//        Tree<Object> fbTree = new Tree(nodes);
////        System.out.println(fbTree.toString());
//
//        assertEquals("All 3's should be 'fizz', No buzzes. numbers divisable by 15 will be fizzbuzz", "( ( ( . Fizz . ) Fizz . ) 4 ( ( . FizzBuzz . ) 11 . ) )", FizzBuzzTree.fizzBuzzTree(fbTree).toString());
//    }
//    @Test
//    public void testFizzBuzzTree_allFizzBuzz() {
//        Node<Object> nodes = new Node<>(15,
//                new Node<>(30, new Node<>(45,
//                        null, null), null),
//                new Node<>(11, new Node<>(14, null, null), null ));
//        Tree<Object> fbTree = new Tree(nodes);
////        System.out.println(fbTree.toString());
//
//        assertEquals("All 3's should be 'fizz', all 5's should be 'buzz', numbers divisable by 15 will be fizzbuzz",
//                "( ( ( . FizzBuzz . ) FizzBuzz . ) FizzBuzz ( ( . 14 . ) 11 . ) )",
//                FizzBuzzTree.fizzBuzzTree(fbTree).toString());
//    }
//}
