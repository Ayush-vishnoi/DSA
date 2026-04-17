package Graph;
import java.util.*;
public class bfs {
    public static void main(String args[]){
        int n = 5; // number of nodes

        // create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }

        // add edges (undirected graph)
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(0).add(2);
        adj.get(2).add(0);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(2).add(4);
        adj.get(4).add(2);

        bfs obj = new bfs();

        ArrayList<Integer> result = obj.bfs(adj);

        System.out.println("BFS Traversal:");
        for(int x : result){
            System.out.print(x + " ");
        }
   }
   public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
    ArrayList<Integer> res=new ArrayList<>();
    boolean[] visited=new boolean[adj.size()];
    Queue<Integer> q=new LinkedList<>();
    for(int i=0;i<adj.size();i++){
        if(!visited[i]){
            bfss(i,adj,res,visited,q);
        }
    }
    return res;
}
    public static void bfss(int node,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res,boolean[] visited,Queue<Integer> q){
        visited[node]=true;
        q.add(node);
        while(!q.isEmpty()){
            int nod=q.poll();
            res.add(nod);
            for(int neig:adj.get(nod)){
                if(!visited[neig]){
                    visited[neig]=true;
                    q.add(neig);
                }
            }
        }
    }
}
