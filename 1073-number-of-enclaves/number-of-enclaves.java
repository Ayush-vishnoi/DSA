class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int numEnclaves(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        boolean[][] vis=new boolean[n][m];
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1){
                    if(arr[i][j]==1){
                        q.add(new Pair(i,j));
                        vis[i][j]=true;
                    }
                }
            }
        }
        int[] dr={0,0,-1,1};
        int[] dc={1,-1,0,0};
        while(!q.isEmpty()){
            Pair p=q.poll();
            int r=p.row;
            int c=p.col;
            for(int i=0;i<4;i++){
                int newr=r+dr[i];
                int newc=c+dc[i];
                if(newr>=0 && newc>=0 && newr<n && newc<m && !vis[newr][newc] && arr[newr][newc]==1){
                    q.add(new Pair(newr,newc));
                    vis[newr][newc]=true;
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                    if(arr[i][j]==1 && !vis[i][j]){
                        c++;                        
                    }
                }
            }
            return c;
        }
    }