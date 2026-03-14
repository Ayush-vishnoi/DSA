class Solution {
    public int bitwiseComplement(int n) {
        String binary=Integer.toBinaryString(n);
        String result="0";
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='0'){
                result+="1"; 
            }
            else{
                result+="0";
            }
        }
        return Integer.parseInt(result,2);
    }
}