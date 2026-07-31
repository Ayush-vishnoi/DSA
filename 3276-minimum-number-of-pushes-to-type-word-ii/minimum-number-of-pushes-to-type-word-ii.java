class Solution {
    public int minimumPushes(String word) {
        int[] fre = new int[26];
        for (char ch : word.toCharArray()) {
            fre[ch - 'a']++;
        }
        Arrays.sort(fre);
        int ans=0;
        int position = 0;
        for (int i = 25; i >= 0; i--) {
            int press = (position / 8) + 1;
            ans += fre[i] * press;
            position++;
        }
        return ans;
    }
}