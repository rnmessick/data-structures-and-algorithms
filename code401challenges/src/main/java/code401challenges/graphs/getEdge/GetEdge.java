package code401challenges.graphs.getEdge;

import code401challenges.graphs.Edge;
import code401challenges.graphs.Graph;
import code401challenges.graphs.Vertex;
import java.util.List;

public class GetEdge {

    public static String getEdge(Graph<String> routes, String[] citiesArray) {
       int tripCost = 0;
        Vertex<String> current = getVertexOfCity(routes, citiesArray[0]);
         //loop through citiesarray searching for the matching value
        // in the graph and all its neighbors
        for (int i = 0; i < citiesArray.length - 1; i++) {
            // Jack Kinne helped me fixed my off by one errors here
            Edge<String> directFlight = findConnectingFlight(routes.getNeighbors(current), citiesArray[i + 1]);

            //if our direct flight connects, we want to get the weight/trip cost and set a new current
            if(directFlight != null) {

                    tripCost += directFlight.getWeight();
                    current = directFlight.getVertex();

                } else {
                //if no connecting flights, return a string array with values False and $0
                return "False " + tripCost;
            }
        }
        return "True " + tripCost;
    }

    //adapted this from my Graph class getNodes as I couldn't access it
    //also adapted from https://www.geeksforgeeks.org/find-paths-given-source-destination/
    public static Vertex<String> getVertexOfCity(Graph<String> graph, String value) {
        List<Vertex<String>> vertices = graph.getNodes();
        //traverse through graph and return every vertex matching the value we want
        for(Vertex<String> vertex : vertices){
            if ( vertex.getValue().equals(value)) {
                return vertex;
            }
        }
        return null;
    }

    public static Edge<String> findConnectingFlight(List<Edge<String>> connectingFlight, String value) {
        //traverse through connectingFlights to return the cost
        for (Edge<String> edge : connectingFlight) {
            if (edge.getVertex().getValue().equals(value)) {
                return edge;
            }
        }
        return null;
    }
}
