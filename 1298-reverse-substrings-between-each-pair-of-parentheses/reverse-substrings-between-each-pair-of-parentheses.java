class Solution {
    public String reverseParentheses(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                String sb="";
                while(st.peek()!='('){
                    sb+=st.pop();
                }
                st.pop();
                for(int j=0;j<sb.length();j++){
                    st.push(sb.charAt(j));
                }
            }
            else st.push(s.charAt(i));
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}