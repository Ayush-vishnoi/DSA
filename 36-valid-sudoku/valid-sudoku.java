class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character>row=new HashSet<>();
            HashSet<Character>col=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                if(!row.add(board[i][j])) return false;
                }
                if(board[j][i]!='.'){
                if(!col.add(board[j][i])) return false;
                }
            }
        }
        for(int block=0;block<9;block++){
            HashSet<Character>set=new HashSet<>();
            int r=(block/3)*3;
            int c=(block%3)*3;
            for(int i=r;i<r+3;i++){
                for(int j=c;j<c+3;j++){
                    if(board[i][j]!='.'){
                        if(!set.add(board[i][j])) return false;
                    }
                }
            }
        }
        return true;
    }
}