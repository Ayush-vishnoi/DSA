class Solution {
    public String processStr(String s) {
        int n=s.length();
        String str="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='*'){
                if(str.isEmpty()) continue;
                str=str.substring(0,str.length()-1);
            }
            else if(s.charAt(i)=='#'){
                if(str.isEmpty()) continue;
                str=str+str;
            }
            else if(s.charAt(i)=='%'){
                if(str.isEmpty()) continue;
                String st="";
                for(int j=str.length()-1;j>=0;j--){
                    st+=str.charAt(j);
                }
                str=st;
            }
            else{
                str+=s.charAt(i);
            }
        }
        return str;
    }
}