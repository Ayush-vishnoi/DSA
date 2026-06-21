class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum=0;
        int c=0;
        for(int i=0;i<costs.length;i++){
            sum+=costs[i];
            if(sum>coins) break;
            c++;
        }
        return c;
    }
}