class Solution {
    public int minimumDeletions(int[] nums) {
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        int minidx=0;
        int maxidx=0;

        for(int i=0;i<nums.length;i++){
            if(mini>nums[i]){
                mini=nums[i];
                minidx=i;
            }
            if(maxi<nums[i]){
                maxi=nums[i];
                maxidx=i;
            }
        }
        int left=Math.max(minidx,maxidx)+1;
        int right=nums.length-Math.min(minidx,maxidx);
        int both=Math.min(minidx,maxidx)+1+nums.length-Math.max(minidx,maxidx);
        return Math.min(left,Math.min(right,both));
    }
}