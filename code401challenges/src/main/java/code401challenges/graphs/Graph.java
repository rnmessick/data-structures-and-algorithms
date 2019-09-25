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
//        Marisha Hoza
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

    // method adapted from https://www.baeldung.com/java-graphs
    public List<Vertex<T>> breadthFirstSearch(Vertex<T> startingNode) {
        List<Vertex<T>> bfsOrder = new LinkedList<>();
        HashSet<Vertex<T>> visited = new HashSet<>();
        Queue<Vertex<T>> queue = new LinkedList<>();

        //Enqueue the declared start node into the Queue.
        queue.add(startingNode);
        visited.add(startingNode);

        //Create a loop that will run while the node still has nodes present.
        while (!queue.isEmpty()) {
            Vertex<T> frontNode = queue.remove();
            bfsOrder.add(frontNode);
            for (Edge<T> child : this.adjacencyList.get(frontNode)) {
                //if the dequeued node has unvisited child nodes,
                //mark the unvisited children as visited and re-insert
                //them back into the queue.
                if (!visited.contains(child.getVertex())) {
                    visited.add(child.getVertex());
                    queue.add(child.getVertex());
                }
            }
        }
        return bfsOrder;
    }

    //adapted from baeldung's depth-first search https://www.baeldung.com/java-depth-first-search
    public HashSet<Vertex<T>> depthFirstSearch(Vertex<T> startingNode) {
        Stack<Vertex<T>> stack = new Stack();
        HashSet<Vertex<T>> isVisited = new HashSet<>();
        //push startingNode into stack
        stack.push(startingNode);
        //while stack is not empty
        while(!stack.isEmpty()) {
            Vertex<T> current = stack.pop();
            //mark current node as visited
            isVisited.add(current);
            System.out.println("" + current);
            //traverse and push unvisited adjacent vertices
            for (Edge<T> edge : this.adjacencyList.get(current)) {
                if (!isVisited.contains(edge.getVertex()) ){
                    stack.push(edge.getVertex());
                }
            }
        }
        return isVisited;
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