package data_structure_algorythm.graph;

public class Test {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "C");
        graph.addEdge("A", "D");
        graph.addEdge("B", "D");
        graph.addEdge("c", "D");

        graph.printGraph();

        graph.removeEdge("A", "C");
        System.out.println("Graph after remove A-C");
        graph.printGraph();

        graph.removeVertex("D");
        System.out.println("Graph after remove D");
        graph.printGraph();
    }
}
