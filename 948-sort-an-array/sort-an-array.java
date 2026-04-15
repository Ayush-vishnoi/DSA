class Solution {
    public int[] sortArray(int[] arr) {
        mergeSort(arr,0,arr.length-1);
        return arr;
    }
    void mergeSort(int arr[], int l, int h) {
        if(l>=h) return;
        int mid=l+(h-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,h);
        merge(arr,l,mid,h);
    }
    void merge(int arr[] ,int l,int mid,int h){
        int left=l;
        int right=mid+1;
        int k=0;
        int[] temp=new int[h-l+1];
        while(left<=mid && right<=h){
            if(arr[left]<arr[right]){
                temp[k++]=arr[left++];
            }
            else  temp[k++]=arr[right++];
        }
            while(left<=mid){
                temp[k++]=arr[left++];
            }
            while(right<=h){
                temp[k++]=arr[right++];
            }
            for(int i=0;i<temp.length;i++){
                arr[l+i]=temp[i];
            }
    }
}