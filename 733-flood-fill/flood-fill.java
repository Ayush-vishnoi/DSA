class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
} 
class Solution {
    public int[][] floodFill(int[][] arr, int sr, int sc, int color) {
        int n=arr.length;
        int m=arr[0].length;
        Queue<Pair>q=new LinkedList<>();
        if(arr[sr][sc]==color) return arr;
        q.add(new Pair(sr,sc));
        int original=arr[sr][sc];
        arr[sr][sc]=color;
        int[] dr={0,0,-1,1};
        int[] dc={1,-1,0,0};
        while(!q.isEmpty()){
            Pair p=q.poll();
            int r=p.row;
            int c=p.col;
            for(int i=0;i<4;i++){
                int newr=r+dr[i];
                int newc=c+dc[i];
                if(newr>=0 && newc>=0 && newr<n && newc<m && arr[newr][newc]==original){
                    arr[newr][newc]=color;
                    q.add(new Pair(newr,newc));
                }
            }

        }
        return arr;
    }
}