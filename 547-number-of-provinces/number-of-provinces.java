class Solution {
    public void dfs(int node,int[][] arr,int[] v){
        v[node]=1;
        for(int i=0;i<arr.length;i++){
            if(arr[node][i]==1 && v[i]==0){
                dfs(i,arr,v);
            }
        }
    }
    public int findCircleNum(int[][] arr) {
        int c=0;
        int v[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(v[i]!=1){
                c++;
                dfs(i,arr,v);
            }
        }
        return c;
    }
}