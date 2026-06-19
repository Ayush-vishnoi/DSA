class Solution {
    public int largestAltitude(int[] gain) {
        int highest=0;
        int curr=0;
        for(int i=0;i<gain.length;i++){
            curr+=gain[i];
            highest=Math.max(highest,curr);
        }
        return highest;
    }
}