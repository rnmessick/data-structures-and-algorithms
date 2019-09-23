package code401challenges.graphs;

import java.util.*;
//## Resources//
//        https://www.baeldung.com/java-graphs//
//        https://www.geeksforgeeks.org/graph-data-structure-and-algorithms///
//        https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-35/resources/graphs.html//
//## Collaborators//
//        Jack Kinne//
//        Nick Paro//
//        Melfi Perez//
//        Matt Stuhring
public class Graph<T> {
    public HashMap<Vertex<T>, List<Edge<T>>> adjacencyList;
    int size = 0;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    //add node/vertex
    public Vertex<T> addNode(T vertex) {
        Vertex<T> node = new Vertex<>(vertex);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
        size++;
        return node;
    }

    //add undirected edge
    // param a = ref to first vertex
    // param b = ref to second vertex
    //param weight = value of weight btw both vertices
    public void addUndirectedEdge(Vertex<T> a, Vertex<T> b, int weight) {
        addDirectedEdge(a, b, weight);
        addDirectedEdge(b, a, weight);
    }
    //add undirected edge
    public void addDirectedEdge(Vertex<T> a, Vertex<T> b, int weight) {
        Edge<T> edge = new Edge<>(weight, b);
        adjacencyList.get(a).add(edge);

    }

    //    ********getters & setters***********
    public List<Edge<T>> getNeighbors(T value) {
        return adjacencyList.get(new Vertex<>(value));

    }

    public List<Vertex<T>> getNodes() {
        List<Vertex<T>> vertices = new ArrayList<>();
        for(Vertex<T> vertex : adjacencyList.keySet()){
            vertices.add(vertex);
        }
        return vertices;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Adjacency List " + this.adjacencyList;
    }
}