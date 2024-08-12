package data_structure_algorythm.graph;

public class Test {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "C");

        graph.printGraph();

        graph.removeEdge("A", "C");
        System.out.println("Graph after remove A-C");
        graph.printGraph();
    }
}
