class Solution {
    public int minPathSum(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        return solve(grid, 0, 0, dp);
    }

    public int solve(int[][] grid, int r, int c, int[][] dp){

        int n = grid.length;
        int m = grid[0].length;

        if(r >= n || c >= m) return Integer.MAX_VALUE;

        if(r == n-1 && c == m-1){
            return grid[r][c];
        }

        if(dp[r][c] != -1){
            return dp[r][c];
        }

        int right = solve(grid, r, c+1, dp);
        int down  = solve(grid, r+1, c, dp);

        int min = Math.min(right, down);

        if(min == Integer.MAX_VALUE) return dp[r][c] = grid[r][c];

        return dp[r][c] = grid[r][c] + min;
    }
}