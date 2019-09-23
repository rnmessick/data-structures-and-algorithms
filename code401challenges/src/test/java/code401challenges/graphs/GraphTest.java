package code401challenges.graphs;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {
//
//    Node can be successfully added to the graph
    @Test
    public void testGraph_addNode() {
        Graph<String> testGraph = new Graph<>();

        assertEquals("Baldr", testGraph.addNode("Baldr").toString() );

    }
//    An edge can be successfully added to the graph

    @Test
    public void testGraph_addEdge() {
        Graph<String> testGraph = new Graph<>();

       Vertex<String> nodeA = testGraph.addNode("Baldr");
       Vertex<String> nodeB = testGraph.addNode("Willow");

       testGraph.addDirectedEdge(nodeA, nodeB, 10);

        assertEquals(10, testGraph.adjacencyList.get(nodeA).get(0).weight);
    }
//    A collection of all nodes can be properly retrieved from the graph
    @Test
    public void testGraph_retrieveAllNodes() {
        Graph<String> testGraph = new Graph<>();

        testGraph.addNode("Baldr");
        testGraph.addNode("Willow");
        List<Vertex<String>> allNodes = testGraph.getNodes();

        assertEquals("[Willow, Baldr]", allNodes.toString() );
    }
//    All appropriate neighbors can be retrieved from the graph
    @Test
    public void testGraph_retrieveNeighbors() {
        Graph<String> testGraph = new Graph<>();

        Vertex<String> nodeA = testGraph.addNode("Baldr");
        Vertex<String> nodeB = testGraph.addNode("Willow");
        testGraph.addDirectedEdge(nodeA, nodeB, 0);

        assertEquals("[Neighbor: Willow Weight: 0]", testGraph.adjacencyList.get(nodeA).toString());

    }
//    Neighbors are returned with the weight between nodes included
    @Test
    public void testGraph_retrieveNeighborsWithWeight() {
        Graph<String> testGraph = new Graph<>();

        Vertex<String> nodeA = testGraph.addNode("Baldr");
        Vertex<String> nodeB = testGraph.addNode("Willow");
        Vertex<String> nodeC =testGraph.addNode("Minerva");
        Vertex<String> nodeD =testGraph.addNode("Amelia");
        testGraph.addDirectedEdge(nodeA, nodeB, 10);
        testGraph.addDirectedEdge(nodeB, nodeC, 5);
        testGraph.addDirectedEdge(nodeD, nodeA, 2);
        testGraph.addDirectedEdge(nodeD, nodeC, 3);
        assertEquals("[Neighbor: Minerva Weight: 5]", testGraph.adjacencyList.get(nodeB).toString());
        assertEquals("[Neighbor: Baldr Weight: 2, Neighbor: Minerva Weight: 3]", testGraph.adjacencyList.get(nodeD).toString());
    }
//    The proper size is returned, representing the number of nodes in the graph
    @Test
    public void testGraph_returnSize() {
        Graph<String> testGraph = new Graph<>();

        testGraph.addNode("Baldr");
        testGraph.addNode("Willow");
        testGraph.addNode("Minerva");
        testGraph.addNode("Amelia");
        testGraph.addNode("Mason");

        assertEquals(5, testGraph.getSize());

    }
    //    A graph with only one node and edge can be properly returned
//    @Test
//    public void testGraph_returnGraphWithOneNodeAndOneEdge() {
//        Graph<String> testGraph = new Graph<>();
//
//        Vertex<String> nodeA = testGraph.addNode("Baldr");
//
//        testGraph.addDirectedEdge(nodeA, nodeA, 5);
//
//        assertEquals("{Baldr=[Neighbor: Baldr Weight: 5]}", testGraph.adjacencyList);
//    }
//    An empty graph properly returns null
    // I can't figure out how to make this null only an empty object
//    @Test
//    public void testGraph_emptyGraph() {
//        Graph testGraph = new Graph();
//
//        assertEquals("Adjacency List {}", testGraph);
//
//    }

}