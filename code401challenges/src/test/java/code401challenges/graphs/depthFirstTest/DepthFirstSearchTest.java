package code401challenges.graphs.depthFirstTest;

import code401challenges.graphs.Graph;
import code401challenges.graphs.Vertex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepthFirstSearchTest {

    @Test
    public void breadthFirst_testHappy() {
        Graph<String> testGraph = new Graph<>();

        Vertex<String> nodeA = testGraph.addNode("Baldr");
        Vertex<String> nodeB = testGraph.addNode("Willow");
        Vertex<String> nodeC = testGraph.addNode("Minerva");
        Vertex<String> nodeD = testGraph.addNode("Amelia");

        testGraph.addDirectedEdge(nodeA, nodeB, 10);
        testGraph.addDirectedEdge(nodeB, nodeC, 15);
        testGraph.addDirectedEdge(nodeB, nodeD, 13);
        testGraph.addDirectedEdge(nodeC, nodeD, 13);
        testGraph.addDirectedEdge(nodeD, nodeB, 10);
        testGraph.addDirectedEdge(nodeD, nodeA, 15);
        //seeing if this causes an extra print out
        testGraph.addDirectedEdge(nodeA, nodeD, 20);

        assertEquals("[Baldr, Willow, Minerva, Amelia]", testGraph.depthFirstSearch(nodeA).toString());
    }

    @Test
    public void breadthFirst_testAnyStartingNode() {
        Graph<String> testGraph = new Graph<>();

        Vertex<String> nodeA = testGraph.addNode("Baldr");
        Vertex<String> nodeB = testGraph.addNode("Willow");
        Vertex<String> nodeC = testGraph.addNode("Minerva");
        Vertex<String> nodeD = testGraph.addNode("Amelia");

        testGraph.addDirectedEdge(nodeA, nodeB, 10);
        testGraph.addDirectedEdge(nodeB, nodeC, 15);
        testGraph.addDirectedEdge(nodeB, nodeD, 13);
        testGraph.addDirectedEdge(nodeC, nodeD, 13);
        testGraph.addDirectedEdge(nodeD, nodeB, 10);
        testGraph.addDirectedEdge(nodeD, nodeA, 15);
        //seeing if this causes an extra print out
        testGraph.addDirectedEdge(nodeA, nodeD, 20);

        assertEquals("[Amelia, Willow, Baldr, Minerva]", testGraph.depthFirstSearch(nodeD).toString());
    }

    @Test
    public void testDepthFirst_islands() {
        Graph<String> testGraph = new Graph<>();

        Vertex<String> nodeA = testGraph.addNode("Baldr");
        //island
        Vertex<String> nodeB = testGraph.addNode("Willow");
        Vertex<String> nodeC = testGraph.addNode("Minerva");
        Vertex<String> nodeD = testGraph.addNode("Amelia");

        testGraph.addDirectedEdge(nodeA, nodeC, 10);
        testGraph.addDirectedEdge(nodeA, nodeD, 15);
        testGraph.addDirectedEdge(nodeC, nodeD, 13);
        testGraph.addDirectedEdge(nodeB, nodeB, 10);

        assertEquals("nodeB is an island so Willow will only be in the array", "[Willow]", testGraph.depthFirstSearch(nodeB).toString());
    }

}
