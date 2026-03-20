class Solution {
    public int totalNQueens(int n) {
        List<List<String>> result=new ArrayList<>();
        char[][] board=new char[n][n];
        for(char[] row :board){
            Arrays.fill(row,'.');
        }
        backtracking(0,result,board,n);
        return result.size();
    }
    public void backtracking(int row,List<List<String>> result,char[][] board,int n){
        if(row==n){
            result.add(construct(board));
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(board,row,col,n)){
                board[row][col]='Q';
                backtracking(row+1,result,board,n);
                board[row][col]='.';
            }
        }
    }
    public boolean isSafe(char[][] board,int row,int col,int n){
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }
        return true;
    }
    public List<String> construct(char[][] board){
        List<String> lst=new ArrayList<>();
        for(char[] row:board){
            lst.add(new String(row));
        }
        return lst;
    }
}