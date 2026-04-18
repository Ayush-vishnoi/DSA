class Solution {
    public String convert(String s, int n) {
        if (n == 1 || s.length() <= n) return s;

        ArrayList<Character>[] ans=new ArrayList[n];
        for(int i=0;i<n;i++){
            ans[i]=new ArrayList<>();
        }
        int k=0;
        int turn=0;
        for(int i=0;i<s.length();i++){
            ans[k].add(s.charAt(i));
            if(turn==0){
                k++;
                if(k==n){
                    k=k-2;
                    turn=1;
                }
            }
            else{
                k--;
                if(k==-1){
                k=1;
                turn=0;
                }
            }
        }
        String res="";
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].size();j++){
                res+=ans[i].get(j);
            }
        }
        return res;
    }
}