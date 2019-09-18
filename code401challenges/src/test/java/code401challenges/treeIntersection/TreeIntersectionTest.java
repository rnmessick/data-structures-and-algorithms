package code401challenges.treeIntersection;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeIntersectionTest {

    @Test
    public void testTreeIntersection_emptyTree() {
        Tree<Integer> testTree1 = new Tree<>();
        Tree<Integer> testTree2 = new Tree<>();

        assertEquals("[]", TreeIntersection.treeIntersections(testTree1, testTree2).toString());
    }

    @Test
    public void testTreeIntersection_happyPath() {
        Tree<Integer> testTree1 = new Tree<>();
        testTree1.root = new Node<>(42);
        testTree1.root.leftChild = new Node<>(100);
        testTree1.root.leftChild.leftChild = new Node<>(250);
        testTree1.root.leftChild.rightChild = new Node<>(160);
        testTree1.root.leftChild.rightChild.leftChild = new Node<>(125);
        testTree1.root.leftChild.rightChild.rightChild = new Node<>(175);
        testTree1.root.rightChild = new Node<>(600);
        testTree1.root.rightChild.leftChild = new Node<>(200);
        testTree1.root.rightChild.rightChild = new Node<>(350);
        testTree1.root.rightChild.rightChild.leftChild = new Node<>(150);
        testTree1.root.rightChild.rightChild.rightChild = new Node<>(500);

        Tree<Integer> testTree2 = new Tree<>();
        testTree2.root = new Node<>(150);
        testTree2.root.leftChild = new Node<>(100);
        testTree2.root.leftChild.leftChild = new Node<>(75);
        testTree2.root.leftChild.rightChild = new Node<>(160);
        testTree2.root.leftChild.rightChild.leftChild = new Node<>(125);
        testTree2.root.leftChild.rightChild.rightChild = new Node<>(175);
        testTree2.root.rightChild = new Node<>(250);
        testTree2.root.rightChild.leftChild = new Node<>(200);
        testTree2.root.rightChild.rightChild = new Node<>(350);
        testTree2.root.rightChild.rightChild.leftChild = new Node<>(300);
        testTree2.root.rightChild.rightChild.rightChild = new Node<>(500);

        assertEquals("[100, 125, 160, 175, 150, 200, 250, 350, 500]", TreeIntersection.treeIntersections(testTree1, testTree2).toString());
    }

    @Test
    public void testTreeIntersection_noMatches() {
        Tree<Integer> testTree1 = new Tree<>();
        testTree1.root = new Node<>(42);
        testTree1.root.leftChild = new Node<>(101);
        testTree1.root.leftChild.leftChild = new Node<>(255);
        testTree1.root.leftChild.rightChild = new Node<>(165);
        testTree1.root.rightChild = new Node<>(600);
        testTree1.root.rightChild.leftChild = new Node<>(205);
        testTree1.root.rightChild.rightChild = new Node<>(350);

        Tree<Integer> testTree2 = new Tree<>();
        testTree2.root = new Node<>(150);
        testTree2.root.leftChild = new Node<>(100);
        testTree2.root.leftChild.leftChild = new Node<>(75);
        testTree2.root.leftChild.rightChild = new Node<>(160);
        testTree2.root.rightChild = new Node<>(250);
        testTree2.root.rightChild.leftChild = new Node<>(200);
        testTree2.root.rightChild.rightChild = new Node<>(355);

        assertEquals("[]", TreeIntersection.treeIntersections(testTree1, testTree2).toString());

    }

}