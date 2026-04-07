class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l=0;
        int r=arr.length-1;
        int mid=0;

        while(l<=r){
            mid=l+(r-l)/2;
            if(x==arr[mid]){
                l=mid;
                break;
            }
            else if(x<arr[mid]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        while (l > 0 && arr[l - 1] == x) {
        l--;
        }       
        r=l;
        l=l-1;
        List<Integer> lt=new ArrayList<>();
        while(l>=0 && r<arr.length && k>0){
            if(Math.abs(x-arr[l])<=Math.abs(x-arr[r])){
                lt.add(arr[l]);
                l--;
            }
            else{
                lt.add(arr[r]);
                r++;
            }
            k--;
        }
        while(l>=0 && k>0){
            lt.add(arr[l]);
            l--;
            k--;
        }
        while(arr.length>r && k>0){
            lt.add(arr[r]);
            r++;
            k--;
        }
        Collections.sort(lt);
        return lt;
    }
}