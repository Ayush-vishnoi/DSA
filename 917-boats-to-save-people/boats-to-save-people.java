class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l=0;
        int r=people.length-1;
        int c=0;
        Arrays.sort(people);
        while(l<=r){
            int sum=people[l]+people[r];
            if(sum<=limit){
                c++;
                l++;
                r--;
            }
            else {
                r--;
                c++;
            }
        } 
        return c;   
    }
}