package com.com.datastructures.graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {

    private LinkedList<Integer>[] adjList;

    public Graph(int v){
        adjList = new LinkedList[v];
        for(int i=0;i< adjList.length;i++){
            adjList[i]= new LinkedList<>();
        }
    }

    public void addEdge(int source,int destination){
        adjList[source].add(destination);
        adjList[destination].add(source);
    }

    public int bfs(int source, int destination) {
        boolean[] visited = new boolean[adjList.length];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        while (!queue.isEmpty()) {
            Integer curr = queue.poll();
            visited[curr] = true;
            if (curr == destination) break;

            for (Integer neighbour : adjList[source]) {
                queue.add(neighbour);
            }

        }
        return  0;
    }
    public static void main(String[] args) {
        System.out.println("enter number of vertices and edges ");
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int e = scanner.nextInt();
        Graph graph = new Graph(5);
        System.out.println("enter edges :");
        for(int i=0;i<e;i++){
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            graph.addEdge(src,dest);
        }
    }

}
