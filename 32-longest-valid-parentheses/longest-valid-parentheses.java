class Solution {
    public int longestValidParentheses(String s) {
        int start=0;
        int open=0;
        int longest=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')') open--;
            else open++;
            if(open<0){
                open = 0;
                start = i+1;
            }
            if(open==0){
                longest=Math.max(longest,i-start+1);
            }
        }
        start=s.length()-1;
        open=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==')') open++;
            else open--;
            if(open<0){
                open = 0;
                start = i-1;
            }
            if(open==0){
                longest=Math.max(longest,start-i+1);
            }
        }
        return longest;
    }
}