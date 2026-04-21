class Solution {
    public int[] findOrder(int v, int[][] pre) {
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
        ArrayList<Integer> ans=new ArrayList<>();
        int idx=0;
        while(!q.isEmpty()){
            int node=q.poll();
            ans.add(node);
            for(int nod:graph.get(node)){
                in[nod]--;
                if(in[nod]==0){
                    q.add(nod);
                }
            }
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        if(res.length!=v) return new int[]{};
        return res;
    }
}