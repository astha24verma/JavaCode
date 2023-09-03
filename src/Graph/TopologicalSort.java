package Graph;

//    Given a Directed Acyclic Graph (DAG) with V vertices and E edges, Find any Topological Sorting of that Graph.

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    public static void main(String[] args) {

    }

    //Function to return list containing vertices in Topological order.
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];
        int[] arr = new int[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, stack);
            }
        }

        int i = 0;
        while (!stack.isEmpty()) {
            arr[i] = stack.pop();
            i++;
            //arr[i++] = stack.pop();  <--   OR
        }

        return arr;

    }

    public static void dfs(int V, ArrayList<ArrayList<Integer>> adj, boolean[] visited, Stack<Integer> stack) {

        visited[V] = true;

        for (Integer neighbour : adj.get(V)) {
            if (!visited[neighbour]) {
                dfs(neighbour, adj, visited, stack);
            }
        }

        stack.push(V);
    }
}

