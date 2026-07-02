class Solution {
    public int hIndex(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int h=arr.length-i;
            if(arr[i]>=h) return h;
        }
        return 0;
    }
}