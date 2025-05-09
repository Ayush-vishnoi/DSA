package Questions.Array;

public class maxSubArray {
        public static long maxSubArr(int[] nums) {
            long sum=0;
            long n=nums.length;
            long max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                sum+=nums[i];
                if(sum>max){
                    max=sum;
                }
                if(sum<0){
                    sum=0;
                }
            }
            return max;
        }
        public static void main(String[] args){
            int[] arr={3,5,8,-1,3,-2};
            System.out.println(maxSubArr(arr));
        }
}
