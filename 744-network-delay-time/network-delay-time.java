class Pair{
    int node;
    int t;
    Pair(int node,int t){
        this.node=node;
        this.t=t;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>> arr=new ArrayList<>();
        for(int i=0;i<=n;i++){
            arr.add(new ArrayList<>());
        }
        for(int t[]:times){
            int u=t[0];
            int v=t[1];
            int ti=t[2];
            arr.get(u).add(new int[]{v,ti});
        }
        int dis[]=new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[k]=0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.t, b.t));
        pq.add(new Pair(k,0));
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            int node=p.node;
            int time=p.t;
            if (time > dis[node]) continue;
            for(int nie[]:arr.get(node)){
                int ne=nie[0];
                int t=nie[1];
                if(dis[ne]>time+t){
                    dis[ne]=time+t;
                    pq.offer(new Pair(ne,dis[ne]));
                }
            }

        }
        int ans=0;
        for(int i=1;i<=n;i++){
            if(dis[i]==Integer.MAX_VALUE) return -1;
            ans=Math.max(ans,dis[i]);
        }
        return ans;

    }
}