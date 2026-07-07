class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        long ans=0;
        while(n>0){
            int rem=n%10;
            if(rem>0){ 
                sum+=rem;
                ans=ans*10+rem;
            }
            n/=10;
        }
        long res=0;
        while(ans>0){
            long r=ans%10;
            res=res*10+r;
            ans/=10;
        }
        return (long)(res*sum);
    }
}