class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int res=0;
        for(int i=0;i<houses.length;i++){
            
            int l=0;
            int h=heaters.length-1;
            int min=0;
            while(l<=h){
                int mid=l+(h-l)/2;
                if(heaters[mid]==houses[i]){
                    l=mid;
                    break;
                }
                else if(heaters[mid]<houses[i]){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
            int d1=Integer.MAX_VALUE;
            int d2=Integer.MAX_VALUE;
            if(l-1>=0) d1=Math.abs(heaters[l-1]-houses[i]);
            if(l < heaters.length) d2 = Math.abs(heaters[l] - houses[i]);
            int mind=Math.min(d1,d2);
            res=Math.max(res,mind);
        }
        return res;
    }
}