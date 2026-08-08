class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            boolean check=true;
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    check=false;
                    break;
                }
            }
                if(check) return i;
        }
        return -1;
    }
}