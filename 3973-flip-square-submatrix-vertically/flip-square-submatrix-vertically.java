class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int m=x+k-1;
        for(int i=0;i<k/2;i++){
            for(int j=y;j<y+k;j++){
                int temp=grid[i+x][j];
                grid[i+x][j]=grid[m-i][j];
                grid[m-i][j]=temp;
            }
        }
        return grid;
    }
}