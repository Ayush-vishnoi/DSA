class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int l=0;
        int r=0;
        for(int i=0;i<n;i++){
            r=(nums[n-1]-1)*(nums[n-2]-1);
            l=(nums[0]-1)*(nums[1]-1);
        }
        return Math.max(l,r);
    }
}