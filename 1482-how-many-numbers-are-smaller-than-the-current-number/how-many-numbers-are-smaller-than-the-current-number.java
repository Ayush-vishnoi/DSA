class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=nums[i];
        }
        Arrays.sort(res);
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(res[0],0);
        for(int i=1;i<n;i++){
            if(res[i]!=res[i-1]){
                mp.put(res[i],i);
            }
            else mp.put(res[i],mp.get(res[i-1]));
        }
        for(int i=0;i<n;i++){
            res[i]=mp.get(nums[i]);
        }
        return res;
    }
}