class Solution {
    public int firstStableIndex(int[] arr, int k) {
        int n=arr.length;
        int[] min=new int[n];
        int[] max=new int[n];
        min[n-1]=arr[n-1];
        max[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            max[i] = Math.max(max[i - 1], arr[i]);
        }
        for(int j=n-2;j>=0;j--){
            min[j]=Math.min(min[j+1],arr[j]);
        }
        for(int i=0;i<n;i++){
            if(max[i]-min[i]<=k) return i;
        }
        return -1;
    }
}