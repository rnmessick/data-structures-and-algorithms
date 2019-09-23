package code401challenges.tree.treeIntersection;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeIntersectionTest {

    @Test
    public void testTrees_ManyMatches() {
        Tree<String> testTree1 = new Tree<String>(
                new Node<String>("5",
                        new Node<String>("1",
                                new Node<String>("10"),
                                new Node<String>("0",
                                        new Node<>("2"),
                                        new Node<>("7")
                                )
                        ),
                        new Node<String>("33",
                                new Node<String>("20"),
                                new Node<String>("4",
                                        new Node<String>("13"),
                                        new Node<String>("66")
                                )
                        )
                ));
        Tree<String> testTree2 = new Tree<>(
                new Node<String>("10",
                        new Node<String>("33",
                                new Node<String>("20"),
                                new Node<String>("4",
                                        new Node<String>("9"),
                                        new Node<String>("7")
                                )
                        ),
                        new Node<String>("13",
                                new Node<String>("6"),
                                new Node<String>("21",
                                        new Node<String>("11"),
                                        new Node<String>("65")
                                )
                        )
                )
        );

        assertEquals("[20, 33, 4, 13]", TreeIntersection.treeIntersections(testTree1, testTree2).toString());
    }

    @Test
    public void testTreeIntersection_noMatches() {
        Tree<String> testTree1 = new Tree<String>(
                new Node<String>("13",
                        new Node<String>("14",
                                new Node<String>("15"),
                                new Node<String>("16",
                                        new Node<>("17"),
                                        new Node<>("18")
                                )
                        ),
                        new Node<String>("19",
                                new Node<String>("20"),
                                new Node<String>("21",
                                        new Node<String>("22"),
                                        new Node<String>("23")
                                )
                        )
                ));
        Tree<String> testTree2 = new Tree<>(
                new Node<String>("1",
                        new Node<String>("2",
                                new Node<String>("3"),
                                new Node<String>("4",
                                        new Node<String>("5"),
                                        new Node<String>("6")
                                )
                        ),
                        new Node<String>("7",
                                new Node<String>("8"),
                                new Node<String>("9",
                                        new Node<String>("10"),
                                        new Node<String>("11")
                                )
                        )
                )
        );

        assertEquals("[]", TreeIntersection.treeIntersections(testTree1, testTree2).toString());
    }

}
