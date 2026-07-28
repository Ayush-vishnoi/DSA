class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        char middle=0;
        for(char i='a';i<='z';i++){
                int n=mp.getOrDefault(i,0);
                for(int j=0;j<n/2;j++){
                    sb.append(i);
                }
                if(n%2==1) middle=i;
            }
        String first=sb.toString();
        String last=sb.reverse().toString();
        if(middle!=0) return first+middle+last;
        return first+last;
    }
}