class Solution {
    public int firstStableIndex(int[] arr, int k) {
        int ans=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            int min=Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
                min=Math.min(min,arr[j]);
            }
            int diff=max-min;
            if(diff<=k) return i;
        }
        return -1;
    }
}