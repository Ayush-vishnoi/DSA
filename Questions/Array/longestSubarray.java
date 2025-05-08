package Questions.Array;
public class longestSubarray {
    public static void main(String[] args){
        int[] arr={2,57,8,5,4,6};
        int k=9;
        int len=0;
        for(int i=0;i<arr.length;i++){
            int s=0;
            for(int j=i;j<arr.length;j++){
                s+=arr[j];
                if(s==k){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        System.out.println(len);
    }
}
