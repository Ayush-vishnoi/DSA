import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> a[0]-b[0]);
         int n=intervals.length;
         List<int[]> ans =new ArrayList<>();
         for(int[] interval: intervals){
            if(ans.isEmpty() || interval[0] > ans.get(ans.size()-1)[1] ){
                ans.add(new int[]{interval[0],interval[1]});
            }
            else{
                ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],interval[1]);
            }
         }
        return ans.toArray(new int[ans.size()][]);
    }
}