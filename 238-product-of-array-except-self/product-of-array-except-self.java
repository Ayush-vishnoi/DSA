class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int p=1;
        int pd=1;
        int x=0;
        for(int i=0;i<n;i++){
            p*=nums[i];
            if(nums[i]==0){
                x++;
                continue;
            }
            else pd*=nums[i];
        }
        for(int i=0;i<n;i++){
            if(x>1){
                nums[i]=0;
            }
            else{
            if(nums[i]==0){
                nums[i]=pd;
            }
            else nums[i]=p/nums[i];
            }
        }
        return nums;
    }
}