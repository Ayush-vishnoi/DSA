class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+2];
        for(int i=nums.length-1;i>=0;i--){
            int take=nums[i]+dp[i+2];
            int nottake=dp[i+1];
            dp[i]=Math.max(take,nottake);
        }
        return dp[0];
    }
}