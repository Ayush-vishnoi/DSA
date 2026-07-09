class Solution {

    static final int MOD = 1_000_000_007;

    public int[] sumAndMultiply(String s, int[][] queries) {

        ArrayList<Integer> digits = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            if (d != 0) {
                digits.add(d);
                pos.add(i);
            }
        }

        int k = digits.size();

        long[] prefixSum = new long[k + 1];
        long[] prefixNum = new long[k + 1];
        long[] pow10 = new long[k + 1];

        pow10[0] = 1;

        for (int i = 0; i < k; i++) {
            prefixSum[i + 1] = prefixSum[i] + digits.get(i);
            prefixNum[i + 1] = (prefixNum[i] * 10 + digits.get(i)) % MOD;
            pow10[i + 1] = (pow10[i] * 10) % MOD;
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            int L = Collections.binarySearch(pos, l);
            if (L < 0) L = -L - 1;

            int R = Collections.binarySearch(pos, r);
            if (R < 0) R = -R - 2;

            if (L > R || L == k || R < 0) {
                ans[i] = 0;
                continue;
            }

            long sum = prefixSum[R + 1] - prefixSum[L];

            int len = R - L + 1;

            long num = (prefixNum[R + 1] - (prefixNum[L] * pow10[len]) % MOD + MOD) % MOD;

            ans[i] = (int) ((num * (sum % MOD)) % MOD);
        }

        return ans;
    }
}