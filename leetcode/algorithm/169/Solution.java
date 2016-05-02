public class Solution {
    

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        
        int max=0;
        int count=1;
        int index=1;
        int element=nums[index-1];
        
        while(index<nums.length) {
            if (nums[index]==nums[index-1]){
                count++;
            }else{
                if (count>max) {
                    element=nums[index-1];
                    max=count;
                }
                count=1;
            }
            index++;
        }
        
       if (count>max) {
            element=nums[index-1];
        }                
            
        return element;
    }

    
    
}
