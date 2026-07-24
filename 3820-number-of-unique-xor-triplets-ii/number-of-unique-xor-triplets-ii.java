class Solution {
    public int uniqueXorTriplets(int[] nums) {

        final int MAX = 2048;

        boolean[] pair = new boolean[MAX];

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                pair[nums[i] ^ nums[j]] = true;
            }
        }

        boolean[] ans = new boolean[MAX];
        for (int x = 0; x < MAX; x++) {

            if (!pair[x]) continue;

            for (int num : nums) {
                ans[x ^ num] = true;
            }
        }

        int count = 0;

        for (boolean b : ans)
            if (b) count++;

        return count;
    }
}