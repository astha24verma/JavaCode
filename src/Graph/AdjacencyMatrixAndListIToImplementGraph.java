package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyMatrixAndListIToImplementGraph {
    public static void main(String[] args) {

        // M1 : Adjacency Matrix

        AdjacencyMatrix gph = new AdjacencyMatrix();
        gph.addEdge(0, 1);
        gph.addEdge(0, 3);
        gph.addEdge(0, 4);
        gph.addEdge(1, 0);
        gph.addEdge(1, 3);
        gph.addEdge(2, 4);
        gph.addEdge(3, 0);
        gph.addEdge(3, 1);
        gph.addEdge(3, 4);
        gph.addEdge(4, 0);
        gph.addEdge(4, 2);
        gph.addEdge(4, 3);

        gph.printAdjacencyMatrix();


        // M2 : Adjacency List

        int v = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        AdjacencyList g = new AdjacencyList();
        g.addEdge(adj, 0, 1);
        g.addEdge(adj, 0, 3);
        g.addEdge(adj, 0, 4);
//        g.addEdge(adj, 1, 0);
        g.addEdge(adj, 1, 3);
        g.addEdge(adj, 2, 4);
//        g.addEdge(adj, 3, 0);
//        g.addEdge(adj, 3, 1);
        g.addEdge(adj, 3, 4);
//        g.addEdge(adj, 4, 0);
//        g.addEdge(adj, 4, 2);
//        g.addEdge(adj, 4, 3);

        g.printAdjacencyList(adj);
        //Also
        System.out.println(adj);

        // BFS
        System.out.println("BFS Traversal of Graph : \n" + bfsOfGraph(v, adj));

        // DFS
        System.out.println("DFS Traversal of Graph : \n" + dfsOfGraph(v, adj));


//        https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
        // Cycle detection in Undirected graph - Using BFS


        // Cycle detection in Undirected graph - Using DFS
        System.out.println("Cycle present (DFS check) " + CycleDetection(v, adj));

//        https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1
        //Detect cycle in a directed graph - DFS

    }

    private static Boolean CycleDetection(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        return isCyclicDFS(0, -1, adj, visited);
    }

    private static Boolean isCyclicDFS(int V, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[V] = true;

        for (Integer neighbour : adj.get(V)) {
            if (!visited[neighbour]) {
                if(isCyclicDFS(neighbour, V, adj, visited))
                    return true;
            } else if (neighbour != parent) {
                // Cycle present when - neighbour is visited & neighbour != parent
                return true;
            }
        }

        return false;

    }

    //Detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        boolean[] dfsVisited = new boolean[V];

        for(int i = 0; i < V; i++){
            if(!visited[i]){
                if(isCyclicDFSDirectedGraph(i, adj, visited, dfsVisited))
                    return true;
            }
        }

        return false;
    }

    public boolean isCyclicDFSDirectedGraph(int V, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] dfsVisited){

        visited[V] = true;
        dfsVisited[V] = true;

        for(Integer neighbour : adj.get(V)){
            if(!visited[neighbour]){
                if(isCyclicDFSDirectedGraph(neighbour, adj, visited, dfsVisited)){
                    return true;
                }else if(dfsVisited[neighbour]){
                    return true;
                }
            }
        }

        dfsVisited[V] = false;
        return false;

    }


    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> bfsList = new ArrayList<>();
        boolean[] visited = new boolean[V];


        for (int i = 0; i < V; i++) {   // For undirected graph

            if (!visited[i]) {

                Queue<Integer> q = new LinkedList<Integer>();
                q.add(i);
                visited[i] = true;

                while (!q.isEmpty()) {

                    int curr = q.remove();
                    bfsList.add(curr);

                    for (Integer list : adj.get(curr)) {
                        if (!visited[list]) {
                            q.add(list);
                            visited[list] = true;
                        }
                    }

                }

            }

        }
        return bfsList;
    }

    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[V];
        visited[0] = true;

        dfs(0, adj, visited, ans);

        return ans;

    }

    public static void dfs(int V, ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> ans) {

        vis[V] = true; // V is vertex or node
        ans.add(V);

        for (Integer neighbour : adj.get(V)) {         // For vertex V -> neighbour1, neighbour2, ..., neighbourN
            if (!vis[neighbour]) {
                dfs(neighbour, adj, vis, ans);
            }
        }

    }

}

class AdjacencyMatrix {
    int v = 5;
    int e = 6;

    int[][] a = new int[v + 1][v + 1];

    public void addEdge(int src, int dest) {
        a[src][dest] = 1;
        a[dest][src] = 1;
    }

    public void printAdjacencyMatrix() {
        System.out.println("Adjacency Matrix To represent Graph : ");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class AdjacencyList {

    int v = 5;

    public void addEdge(ArrayList<ArrayList<Integer>> adj, int src, int dest) {
        adj.get(src).add(dest);
        adj.get(dest).add(src);
    }

    public void printAdjacencyList(ArrayList<ArrayList<Integer>> adj) {
        System.out.println("Adjacency List To represent Graph : ");
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> " + adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }


}




