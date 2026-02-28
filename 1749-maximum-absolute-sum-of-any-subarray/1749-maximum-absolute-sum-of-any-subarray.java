class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int maxend=nums[0];
        int minend=nums[0];

        int res=Math.abs(nums[0]);

        for(int i=1;i<n;i++){
            int v1=maxend+nums[i];
            int v2=minend+nums[i];
            int v3=nums[i];

            maxend=Math.max(v1,v3);
            minend=Math.min(v2,v3);

            res=Math.max(res,Math.max(Math.abs(maxend),Math.abs(minend)));
        }
        return res;
    }
}