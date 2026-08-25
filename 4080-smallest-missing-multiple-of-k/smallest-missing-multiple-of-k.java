class Solution {
    public int missingMultiple(int[] nums, int k) {
      Set<Integer>st=new HashSet<>();
      for(int num:nums){
        st.add(num);
      }
      for(int i=1;i<=nums.length+1;i++){
        if(!st.contains(k*i)) return k*i;
      }
      return k;
    }
}