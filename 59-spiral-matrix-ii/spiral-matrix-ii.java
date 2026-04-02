class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result=new int[n][n];
        int top=0;
        int left=0;
        int right=n-1;
        int bottom=n-1;
        int c=1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                result[top][i]=c;
                c++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                result[i][right]=c;
                c++;
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                result[bottom][i]=c;
                c++;
            }
            bottom--;
            }
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                result[i][left]=c;
                c++;
            }
            left++;
            }
        }
        return result;
    }
}