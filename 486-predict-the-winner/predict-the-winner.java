class Solution {
    public boolean predictTheWinner(int[] nums) {
        return resursion(0,nums.length-1,0,0,true,nums);
    }
    public boolean resursion(int left,int right,int p1,int p2,boolean turn,int[] nums){
        if(left>right) return p1>=p2;
        if(turn){
            return resursion(left+1,right,p1+nums[left],p2,false,nums) || 
                    resursion(left,right-1,p1+nums[right],p2,false,nums);
        }
        else{
            return resursion(left+1,right,p1,p2+nums[left],true,nums) &&
                    resursion(left,right-1,p1,p2+nums[right],true,nums);
        }
    }
}