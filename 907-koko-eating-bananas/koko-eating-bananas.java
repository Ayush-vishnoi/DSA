import java.util.*;
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=0;
        int hi=Arrays.stream(piles).max().getAsInt();
        while(l<=hi){
            int mid=(l+hi)/2;
            int total=calmax(piles,mid);
            if(total<=h) hi=mid-1;
            else l=mid+1;
        }
        return l;
    }
    public int calmax(int[] nums,int m){
        int totalh=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            totalh+=Math.ceil((double)nums[i]/(double)m);
        }
        return totalh;
    }
}