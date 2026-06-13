class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int sum=0;
        String ans="";
        for(int i=0;i<words.length;i++){
            sum=0;
            for(int j=0;j<words[i].length();j++){
                sum+=weights[words[i].charAt(j)-'a'];
            }
            sum=sum%26;
            char ch=(char)('z'-sum);
            ans+=ch;
        }
        return ans;
    }
}