package com.graph;
import java.util.*;

class DijkstraAlgo {
    static class Node implements Comparable<Node> {
        int vertex, weight;

        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        public int compareTo(Node other) {
            return this.weight - other.weight; // Min Heap (priority queue)
        }
    }

    public static void dijkstra(int[][] graph, int source) {
        int V = graph.length; // Number of vertices
        int[] distance = new int[V]; // Stores shortest distance from source
        boolean[] visited = new boolean[V]; // Tracks visited nodes

        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(source, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int u = current.vertex;

            if (visited[u]) continue;
            visited[u] = true;

            // Explore neighbors
            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !visited[v]) { // Check for edge existence
                    int newDist = distance[u] + graph[u][v];

                    if (newDist < distance[v]) { // Update distance if smaller
                        distance[v] = newDist;
                        pq.add(new Node(v, newDist));
                    }
                }
            }
        }

        printSolution(distance);
    }

    private static void printSolution(int[] distance) {
        System.out.println("Vertex \t Shortest Distance from Source");
        for (int i = 0; i < distance.length; i++) {
            System.out.println(i + " \t " + distance[i]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        int source = 0; // Starting node
        dijkstra(graph, source);
    }
}
