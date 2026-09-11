class Solution {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int mid=n/2;
        long operation=0;

        if(nums[mid]<k){
            for(int i=mid;i<n;i++){
                if(nums[i]<k){
                    operation+=k-nums[i];
                }
            }
        }

        else{
            for(int i=0;i<=mid;i++){
                if(nums[i]>k){
                    operation+=nums[i]-k;
                }
            }
        }
return operation;
        
    }
}