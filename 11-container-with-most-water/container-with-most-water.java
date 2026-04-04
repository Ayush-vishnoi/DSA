class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxi=Integer.MIN_VALUE;
        int area=0;
        while(l<r){
            if(height[l]<height[r]){
                area=height[l]*(r-l);
                l++;
            }
            else{
                area=height[r]*(r-l);
                r--;
            }
            maxi=Math.max(maxi,area);

        }
        return maxi;
    }
}