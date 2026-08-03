class Solution {
    public String stoneGameIII(int[] nums) {
        String s[]={"Bob","Tie","Alice"};
        int[] dp =new int[4];
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            dp[i&3]=nums[i]-dp[(i+1)&3];
            if(i+2<=n) dp[i&3]=Math.max(dp[i&3],nums[i]+nums[i+1]-dp[(i+2)&3]);
            if(i+3<=n) dp[i&3]=Math.max(dp[i&3],nums[i]+nums[i+1]+nums[i+2]-dp[(i+3)&3]);
        }
        return s[Integer.compare(dp[0], 0) + 1];
    }
}