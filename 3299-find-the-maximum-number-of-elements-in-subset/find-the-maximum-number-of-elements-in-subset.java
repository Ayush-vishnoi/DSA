class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Long, Integer> freq = new HashMap<>();
        for (int x : nums) {
            freq.put((long) x, freq.getOrDefault((long) x, 0) + 1);
        }
        int ans = 1;
        if (freq.containsKey(1L)) {
            int ones = freq.get(1L);
            ans = Math.max(ans, ones % 2 == 0 ? ones - 1 : ones);
        }
        for (long x : freq.keySet()) {
            if (x == 1)
                continue;
            long cur = x;
            int len = 0;
            while (freq.getOrDefault(cur, 0) >= 2) {
                len += 2;
                cur = cur * cur;
                if (cur > 1e18)
                    break;
            }
            if (freq.getOrDefault(cur, 0) == 1)
                len++;
            else
                len--;
            ans = Math.max(ans, len);
        }
        return ans;
    }
}