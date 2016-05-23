public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        List<Integer> indexes = new ArrayList<>();
        
        Map<Integer,Integer> values = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            values.put(nums[i],i);
        }
        
        for (int i=0;i<nums.length;i++) {
            if (values.containsKey(target-nums[i])) {
                int index=values.get(target-nums[i]);
                if (index !=i && !indexes.contains(i) && !indexes.contains(index)) {
                    indexes.add(i);
                    indexes.add(index);                    
                }
            }
        }
        
        int[] result = new int[indexes.size()];
        Iterator iterator = indexes.iterator();
        for (int i=0;i<indexes.size();i++) {
            result[i]=indexes.get(i);
        }
        
        return result;
    } 
}
