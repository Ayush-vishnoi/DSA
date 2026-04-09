class Solution {
    public boolean isPossible(int[] arr,int m,int k,int mid){
        int c=0;
        int bo=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                c++;
                if(c==k){
                    bo++;
                    c=0;
                }
            }
            else c=0;

        }
        if(bo>=m) return true;
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if((m*k)>n) return -1;
        int l=0;
        int h=0;
        int ans=-1;
        for(int b:bloomDay){
            l=Math.min(l,b);
            h=Math.max(h,b);
        }
        while(l<=h){
            int mid=l+(h-l)/2;
            if(isPossible(bloomDay,m,k,mid)){
                ans=mid;
                h=mid-1;
            }
            else l=mid+1;
        }
        return ans;
    }
}