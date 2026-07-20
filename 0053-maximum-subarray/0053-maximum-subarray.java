class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int cur=nums[0];
        int max=nums[0];

        for(int i=1;i<n;i++){
            int v1=nums[i];
            int v2=cur+nums[i];

            cur=Math.max(v1,v2);
            max=Math.max(max,cur);
        }
        return max;
    }
}