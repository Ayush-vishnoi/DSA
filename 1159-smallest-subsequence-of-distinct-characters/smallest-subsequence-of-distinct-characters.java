class Solution {
    public String smallestSubsequence(String s) {
        int[] lst=new int[26];
        for(int i=0;i<s.length();i++){
            lst[s.charAt(i)-'a']=i;
        }
        boolean[] vis=new boolean[26];
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(vis[ch-'a']) continue;
            while(!st.isEmpty() && st.peek()>ch && lst[st.peek()-'a']>i){
                vis[st.pop()-'a']=false;
            }
            st.push(ch);
            vis[ch-'a']=true;
        }
        StringBuilder ans=new StringBuilder();
        for(char c:st){
            ans.append(c);
        }
        return ans.toString();
    }
}