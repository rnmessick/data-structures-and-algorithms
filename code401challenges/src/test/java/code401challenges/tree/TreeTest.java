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
    public void testPreOrder() {
        //https://www.gontu.org/check-array-represents-preorder-traversal-binary-tree/
//        ArrayList testList = new ArrayList();
//        testList.add(2);
//        testList.add(1);
//        testList.add(3);
//
//        BinarySearchTree binaryTree = new BinarySearchTree();
//        binaryTree.add(1);
//        binaryTree.add(2);
//        binaryTree.add(3);
//
//        assertEquals("preorder binary search", "2,1,3"
    }
//    Can successfully instantiate an empty tree
//    Can successfully instantiate a tree with a single root node
//    Can successfully add a left child and right child to a single root node
//    Can successfully return a collection from a preorder traversal
//    Can successfully return a collection from an inorder traversal
//    Can successfully return a collection from a postorder traversal
}