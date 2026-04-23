class Solution {
    public int minimumEffortPath(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        int[][] dis=new int[n][m];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dis[i],Integer.MAX_VALUE);
        }
        dis[0][0]=0;
        q.add(new int[]{0,0,0});
        int[] dr={0, 0, -1, 1};
        int[] dc={-1,  1, 0, 0};
        while(!q.isEmpty()){
            int[] p=q.poll();
            int r=p[0];
            int c=p[1];
            int d=p[2];
            if(r==n-1 && c==m-1) return d;
            if (d > dis[r][c]) continue;
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0 && nc>=0 && nr<n && nc<m){
                    int newdiff=Math.max(d,Math.abs(arr[nr][nc]-arr[r][c]));
                    if(newdiff<dis[nr][nc]){
                        q.add(new int[]{nr,nc,newdiff});
                        dis[nr][nc]=newdiff;
                    }
                    
                }
            }
        }
        return 0;
    }
}