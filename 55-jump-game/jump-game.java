class Solution {
    public boolean canJump(int[] nums) {
        Boolean[] dp=new Boolean[nums.length];
        return jump(nums,0,dp);
    }
        private boolean jump(int[] nums, int index,Boolean[] dp) {
        if (index >= nums.length - 1) {
            return true;
        }
        if (dp[index] != null) {
            return dp[index];
        }
        for (int step = 1; step <= nums[index]; step++) {
            if (jump(nums, index + step, dp)) {
                return dp[index] = true;
            }
        }
        return dp[index] = false;
    }
}