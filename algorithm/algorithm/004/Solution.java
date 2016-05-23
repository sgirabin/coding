public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] merge = new int[nums1.length + nums2.length];
        System.arraycopy(nums1,0,merge,0,nums1.length);
        System.arraycopy(nums2,0,merge,nums1.length,nums2.length);
        Arrays.sort(merge);
        
        double median = 0;
        int index = (merge.length+1)/2;
        if (merge.length%2==0) {
            median = (merge[index] + merge[index-1])/2.0;
        }else {
            median = merge[index-1];
        }
        
        return median;
        
    }
}
