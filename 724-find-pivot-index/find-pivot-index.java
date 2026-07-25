class Solution {
    public int pivotIndex(int[] arr) {
        int n=arr.length;
       int[] left=new int[n];
       int[] right=new int[n];
       left[0]=arr[0];
       right[n-1]=arr[n-1];
       int j=n-2;
       for(int i=1;i<n;i++){
           left[i]=left[i-1]+arr[i];
           right[j]=right[j+1]+arr[j];
           j--;
       }
       for(int i=0;i<n;i++){
            int leftSum = (i == 0) ? 0 : left[i - 1];
            int rightSum = (i == n - 1) ? 0 : right[i + 1];
            if (leftSum == rightSum)
                return i;
    }
    return -1;
}
}