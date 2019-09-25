package code401challenges.graphs.getEdge;

import code401challenges.graphs.Graph;
import code401challenges.graphs.Vertex;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest {

    @Test
    public void testGetEdge() {
        Graph<String> testGraph = new Graph<>();

        Vertex<String> nodeA = testGraph.addNode("Pandora");
        Vertex<String> nodeB = testGraph.addNode("Arendelle");
        Vertex<String> nodeC = testGraph.addNode("Metroville");
        Vertex<String> nodeD = testGraph.addNode("Monstropolis");
        Vertex<String> nodeE = testGraph.addNode("Narnia");
        Vertex<String> nodeF = testGraph.addNode("Naboo");
        testGraph.addDirectedEdge(nodeA, nodeB, 150);
        testGraph.addDirectedEdge(nodeA, nodeC, 82);
        testGraph.addDirectedEdge(nodeB, nodeC, 99);
        testGraph.addDirectedEdge(nodeC, nodeD, 105);
        testGraph.addDirectedEdge(nodeB, nodeD, 42);
        testGraph.addDirectedEdge(nodeC, nodeE, 37);
        testGraph.addDirectedEdge(nodeC, nodeF, 26);
        testGraph.addDirectedEdge(nodeE, nodeF, 250);
        testGraph.addDirectedEdge(nodeD, nodeF, 73);
    }

}