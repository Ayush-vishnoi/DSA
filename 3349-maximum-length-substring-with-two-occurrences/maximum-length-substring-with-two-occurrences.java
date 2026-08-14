class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int maxi=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.get(s.charAt(i))>2){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            maxi=Math.max(maxi,i-left+1);
        }
        return maxi;
    }
}