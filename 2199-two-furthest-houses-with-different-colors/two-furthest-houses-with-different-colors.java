class Solution {
    public int maxDistance(int[] color) {
        int ans=0;
        for(int i=0;i<color.length-1;i++){
            for(int j=i+1;j<color.length;j++){
                if(color[i]!=color[j]){
                    ans=Math.max(ans,j-i);
                }
            }
        }
        return ans;

    }
}