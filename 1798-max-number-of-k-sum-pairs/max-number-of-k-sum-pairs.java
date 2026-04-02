class Solution {
    public int maxOperations(int[] nums, int k) {
        int l=0;
        int r=nums.length-1;
        int c=0;
        Arrays.sort(nums);
        while(l<r){
            int sum=nums[l]+nums[r];
            if(sum==k){
                c++;
                l++;
                r--;
            }
            else if(sum<k) l++;
            else r--;
        } 
        return c;   
        }
}