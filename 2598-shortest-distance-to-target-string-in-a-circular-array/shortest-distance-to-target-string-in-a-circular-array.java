class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int len=Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(target)){
                int dis=Math.abs(startIndex-i);
                len=Math.min(len,Math.min(dis,n-dis));
            }
        }
        return len==Integer.MAX_VALUE? -1:len;
    }
}