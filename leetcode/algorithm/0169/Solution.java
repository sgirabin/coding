public class Solution {
    

    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        int element=nums[0];
        int max=1;        
        int current=nums[0];
        int total=1;
        for (int i=1;i<nums.length;i++) {
            if (nums[i]==current) {
                total=total+1;
                if (total>max) {
                    element=nums[i];
                    max=total;
                }
            }else{
                current=nums[i];
                total=1;
            }
        }
                   
        return element;
    }

    
    
}
