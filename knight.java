

// recursion 

import java.util.*;
public class knight {
    static int[][] dirs = {
        {-2,-1},{-2,1},{-1,-2},{-1,2},
        {1,-2},{1,2},{2,-1},{2,1}
    };
    public static void main(String[] args){
        int n=3;
        int k=2;
        int row=0;
        int column=0;
        System.out.print(solve(n,k,row,column));

    }
    public static double solve(int n,int k,int row,int column){
        if(row<0 || column<0 || row>=n || column>=n) return 0;
        if(k==0) return 1;
        double prob=0.0;
        for(int[] dp:dirs){
        prob+=solve(n,k-1,row+dp[0],column+dp[1])/8.0;
        }
        return prob;
    }
}
