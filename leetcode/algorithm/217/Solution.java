public class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        
        Arrays.sort(nums);        
        
        int index=0;
        boolean duplicate = false;
        while(index<nums.length-1 && !(duplicate=(nums[index]==nums[index+1])) ){
            index++;
        }

      
        return duplicate;
    }
}
