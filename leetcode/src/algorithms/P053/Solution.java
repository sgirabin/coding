public class Solution {
    public int maxSubArray(int[] nums) {
        
        int[] total = new int[nums.length];
        int max=0;

        total[0]=nums[0];
        max=total[0];
        for (int i=1;i<nums.length;i++) {
            total[i] = Math.max(nums[i],total[i-1]+nums[i]);
            max=Math.max(total[i],max);
        }
        
        return max;
    }
}
