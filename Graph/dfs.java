package Graph;
import java.util.*;
public class dfs {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<4;i++) adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);

        dfs obj = new dfs();
        System.out.println(obj.dfs(adj));
    }
        public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
            ArrayList<Integer> res=new ArrayList<>();
            boolean[] visited=new boolean[adj.size()];
            for(int i=0;i<adj.size();i++){
                if(!visited[i]){
                dfss(i,adj,visited,res);
                }
            }
            return res;
        }
        public ArrayList<Integer> dfss(int node,ArrayList<ArrayList<Integer>> adj,boolean[] visited,ArrayList<Integer> res){
            visited[node]=true;
            res.add(node);
            for(int neigh:adj.get(node)){
                if(!visited[neigh]){
                    dfss(neigh,adj,visited,res);
                }
            }
            return res;
        }
}
