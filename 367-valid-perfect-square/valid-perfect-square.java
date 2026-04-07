class Solution {
    public boolean isPerfectSquare(int num) {
        int l=1;
        int h=num/2;
        if(num==1) return true;
        while(l<=h){
            int  mid=l+(h-l)/2;
            if((long)mid*mid==num){
                return true;
            }
            else if((long)mid*mid>num){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}