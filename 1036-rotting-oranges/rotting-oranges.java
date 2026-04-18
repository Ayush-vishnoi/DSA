class Pair {
    int row;
    int col;
    int time;

    Pair(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int fresh = 0;
        int ans = 0;
        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1)
                    fresh++;
                if (grid[i][j] == 2)
                    q.add(new Pair(i, j, 0));
            }
        }
        int[] dr = { 1, -1, 0, 0 };
        int[] dc = { 0, 0, 1, -1 };
        while (!q.isEmpty()) {
            Pair p = q.poll();
            int r = p.row;
            int c = p.col;
            int t = p.time;
            ans = Math.max(ans, t);
            for (int i = 0; i < 4; i++) {
                int nrow = r + dr[i];
                int ncol = c + dc[i];
                if (nrow >= 0 && ncol >= 0 && nrow < n && ncol < m && grid[nrow][ncol] == 1) {
                    q.add(new Pair(nrow, ncol, t + 1));
                    grid[nrow][ncol] = 2;
                    fresh--;
                }
            }
        }
        if (fresh==0)
            return ans;
        return -1;
    }
}