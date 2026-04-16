class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int pivot=partition(nums,l,h);
            if(pivot==(n-k)) return nums[pivot];
            else if(pivot<(n-k)) l=pivot+1;
            else h=pivot-1;
        }
        return -1;


    }
    private int partition(int[] arr, int low, int high) {
        int pivot=arr[low];
        int i=low;
        
        for(int j=low+1;j<=high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        
        int temp=arr[i];
        arr[i]=arr[low];
        arr[low]=temp;
       return i;
    }
}