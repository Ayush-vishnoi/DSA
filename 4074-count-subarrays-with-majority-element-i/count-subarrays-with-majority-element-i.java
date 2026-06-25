class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int j=i;j<n;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                int len=j-i+1;
                if(map.getOrDefault(target,0)>len/2) ans++;
            }
        }
        return ans;
    }
}