class Solution {
    public int maxActiveSectionsAfterTrade(String s) {

        String t = "1" + s + "1";

        List<Integer> len = new ArrayList<>();
        List<Character> ch = new ArrayList<>();

        int i = 0;
        while (i < t.length()) {
            int j = i;
            while (j < t.length() && t.charAt(j) == t.charAt(i))
                j++;

            ch.add(t.charAt(i));
            len.add(j - i);

            i = j;
        }

        int ones = 0;

        for (int x = 0; x < s.length(); x++)
            if (s.charAt(x) == '1')
                ones++;

        int ans = ones;

        for (int k = 1; k + 1 < len.size(); k++) {

            if (ch.get(k) == '1'
                    && ch.get(k - 1) == '0'
                    && ch.get(k + 1) == '0') {

                ans = Math.max(ans,
                        ones + len.get(k - 1) + len.get(k + 1));
            }
        }

        return ans;
    }
}