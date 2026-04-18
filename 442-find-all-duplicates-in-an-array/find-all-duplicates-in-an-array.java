class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans=new ArrayList<>();
        int n=arr.length;
        int i=0;
        while(i<n){
            int x=arr[i];
            if(x>0 && x<=n && arr[i]!=arr[x-1]){
                int temp=arr[i];
                arr[i]=arr[x-1];
                arr[x-1]=temp;

            }
            else i++;
        }
        for(int j=0;j<n;j++){
            if(arr[j]!=j+1){
                ans.add(arr[j]);
            }
        }
        return ans;
    }
}