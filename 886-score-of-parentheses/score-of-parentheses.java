class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer>st=new Stack<>();
        st.push(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') st.push(0);
            else{
                int v=st.pop();
                int score=(v==0)?1:2*v;
                st.push(st.pop()+score);
            }
        }
        return st.peek();
    }
}