class Solution {
    public int findGCD(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(maxi,nums[i]);
            mini=Math.min(mini,nums[i]);
        }
        return gdc(maxi,mini);
    }
    public int gdc(int a,int b){
        if(b==0) return a;
        return gdc(b,a%b);
    }
}