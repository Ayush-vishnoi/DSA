class Solution {
    public int shortestPathBinaryMatrix(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        if(arr[0][0]!=0 || arr[n-1][m-1]!=0) return -1;
        arr[0][0]=1;
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{0,0,1});
        int[] dr={-1, -1, -1,  0, 0,  1, 1, 1};
        int[] dc={-1,  0,  1, -1, 1, -1, 0, 1};
        while(!q.isEmpty()){
            int[] p=q.poll();
            int r=p[0];
            int c=p[1];
            int d=p[2];
            if(r==n-1 && c==m-1) return d;
            for(int i=0;i<8;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0 && nc>=0 && nr<n && nc<m && arr[nr][nc]==0){
                    q.add(new int[]{nr,nc,d+1});
                    arr[nr][nc]=1;
                }
            }
        }
        return -1;
    }
}