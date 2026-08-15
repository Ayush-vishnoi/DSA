class Solution {
    public int longestSubsequence(int[] nums) {
        boolean flag=false;
        int bit=0;
        for(int i=0;i<nums.length;i++){
            bit^=nums[i];
            if(nums[i]!=0) flag=true;
        }
        if(bit!=0) return nums.length;
        if(flag) return nums.length-1;
        return 0;
    }
}