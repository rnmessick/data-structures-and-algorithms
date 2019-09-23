package code401challenges.graphs;

public class Edge<T> {
    public int weight;
    public Vertex<T> vertex;

    public Edge(int weight, Vertex<T> vertex) {
        this.weight = weight;
        this.vertex = vertex;
    }
//    **** getters and setters****
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vertex<T> getVertex() {
        return vertex;
    }

    public void setVertex(Vertex<T> vertex) {
        this.vertex = vertex;
    }

    @Override
    public String toString() {
        return "Neighbor: " + this.vertex + " Weight: " + this.weight;
    }
}
