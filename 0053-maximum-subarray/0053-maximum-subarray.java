class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int curr=nums[0];
        int max=nums[0];
        for(int i=1;i<n;i++){
            int v1=curr+nums[i];
            int v2=nums[i];
            curr=Math.max(v1,v2);
            max=Math.max(max,curr);
        }
        return max;
    }
}