class Solution {
    public boolean canFinish(int v, int[][] pre) {
        int[] in=new int[v];
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<v;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge:pre){
            graph.get(edge[1]).add(edge[0]);
            in[edge[0]]++;
        }
        for(int i=0;i<v;i++){
            if(in[i]==0) q.add(i);
        }
        int[] ans=new int[v];
        int idx=0;
        while(!q.isEmpty()){
            int node=q.poll();
            ans[idx++]=node;
            for(int nod:graph.get(node)){
                in[nod]--;
                if(in[nod]==0){
                    q.add(nod);
                }
            }
        }
        return idx==v;
    }
}