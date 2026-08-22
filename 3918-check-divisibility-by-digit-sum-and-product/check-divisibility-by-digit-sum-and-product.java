class Solution {
    public boolean checkDivisibility(int n) {
        if(n<10) return false;
        int sum=0;
        int pro=1;
        int num=n;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            pro*=rem;
            n/=10;
        }
        if(num%(sum+pro)==0) return true;
        return false;
    }
}