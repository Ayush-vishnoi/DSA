class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        int size = row * col;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                temp.add(0);
            }
            ans.add(temp);
        }
        k = k % size;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int idx = i * col + j + k;
                int newr = (idx / col) % row;
                int newc = idx % col;
                ans.get(newr).set(newc, grid[i][j]);

            }
        }
        return ans;
    }
}