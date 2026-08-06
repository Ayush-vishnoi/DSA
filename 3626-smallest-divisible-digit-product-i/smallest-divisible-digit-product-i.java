class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<n+t;i++){
            int num=i;
            int product=1;
            while(num>0){
                int rem=num%10;
                product*=rem;
                num/=10;
            }
            if(product%t==0) return i;
        }
        return 0;
    }
}