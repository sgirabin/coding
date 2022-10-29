class Solution {
    public int firstMissingPositive(int[] nums) {
        int first = 1;
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++) {
            set.add(nums[i]);
            if (nums[i]==first){
                do {
                  first = first + 1;  
                }while (set.contains(first));
            }
        }
        
        return first;
    }
}
