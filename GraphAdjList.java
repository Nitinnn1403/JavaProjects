import java.util.*; 
import java.util.List;

public class GraphAdjList {
    private Map<String , List<String>> adjList = new HashMap<>();

    public void addVertex(String v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(String v1, String v2) {
        adjList.get(v1).add(v2);
        adjList.get(v2).add(v1);
    }

    public void printGraph() {
        for (String vertex : adjList.keySet()) {
            System.out.print(vertex + " -> " + adjList.get(vertex));
        }
    }

    public static void main(String[] args) {
        GraphAdjList g = new GraphAdjList();
        g.addVertex("A");
        g.addVertex("B");
        g.addVertex("C");
        g.addEdge("A", "B");
        g.addEdge("A", "C");
        g.addEdge("B", "C");
        g.printGraph();
    }
}