class Solution {
     
    public int climbStairs(int n) {
        int[] ans = new int[2];
        Arrays.fill(ans, 1);
        for (int i = 2; i <= n; i++) {
            ans[i % 2] = ans[(i - 1) % 2] + ans[(i - 2) % 2];
        }
        return ans[n % 2];
    }
}
