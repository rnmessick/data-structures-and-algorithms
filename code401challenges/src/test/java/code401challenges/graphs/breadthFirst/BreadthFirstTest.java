package code401challenges.graphs.breadthFirst;

import code401challenges.graphs.Graph;
import code401challenges.graphs.Vertex;
import org.junit.Test;

import static org.junit.Assert.*;

public class BreadthFirstTest {

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

        assertEquals("[Willow, Minerva, Amelia, Baldr]", testGraph.breadthFirstSearch(nodeB).toString());
    }

    @Test
    public void breadthFirst_testSingleNode() {
        Graph<String> testGraph = new Graph<>();
        Vertex<String> nodeA = testGraph.addNode("Baldr");
        testGraph.addDirectedEdge(nodeA, nodeA, 0);

        assertEquals("[Baldr]", testGraph.breadthFirstSearch(nodeA).toString());
    }

    @Test
    public void breadthFirst_testEmpty() {
        Graph<String> testGraph = new Graph<>();

        assertEquals("{}", testGraph.adjacencyList.toString());
    }

}