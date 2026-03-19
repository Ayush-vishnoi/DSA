class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        permutation(nums,new ArrayList<>(),new boolean[nums.length],result);
        return result;
    }
    public void permutation(int[] nums,List<Integer> curr,boolean[] visited,List<List<Integer>> result){
        if(curr.size()==nums.length){
            result.add(new ArrayList(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            curr.add(nums[i]);
            visited[i]=true;
            permutation(nums,curr,visited,result);
            curr.remove(curr.size()-1);
            visited[i]=false;
        }    
    }
}