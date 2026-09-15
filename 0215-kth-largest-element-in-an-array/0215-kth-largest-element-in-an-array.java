class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }
    private int quickSelect(int[] nums, int lo, int hi, int target) {
    int pivot = nums[hi], p = lo;
    for (int i = lo; i < hi; i++)
        if (nums[i] < pivot) { 
            int t = nums[i]; 
            nums[i] = nums[p]; 
            nums[p] = t; 
            p++; 
            }
    int t = nums[p]; 
    nums[p] = nums[hi]; 
    nums[hi] = t;
    if (p == target)
     return nums[p];
    return p < target ? quickSelect(nums, p+1, hi, target) : quickSelect(nums, lo, p-1, target);
    }

}