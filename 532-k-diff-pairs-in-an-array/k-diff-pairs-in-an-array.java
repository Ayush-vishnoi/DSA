class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int c=0;
        int n=nums.length;
        while(i<n && j<n){
            if(i==j || nums[j]-nums[i]<k){
                j++;
            }
            else if(nums[j]-nums[i]>k){
                i++;
            }
            else{
                c++;
                i++;
                j++;
            
            while(j<n && nums[j]==nums[j-1]){
                j++;
            }
            }
        }
        return c;
    }
}