class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        int c=0;
        int prev_end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(prev_end>intervals[i][0]) {
                c++;
                prev_end=Math.min(prev_end,intervals[i][1]);
            }
            else prev_end=intervals[i][1];
        }
        return c;
    }
}