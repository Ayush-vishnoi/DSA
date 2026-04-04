class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int l=0;
        int r=0;
        int c=0;
        long p=1;
        while(r<nums.length){
            p*=nums[r];
            while(p>=k){
                p=p/nums[l];
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;
    }
}