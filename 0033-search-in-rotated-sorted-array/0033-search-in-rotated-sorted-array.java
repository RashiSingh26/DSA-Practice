class Solution {
    public int search(int[] nums, int target) {
       int n=nums.length;
        
      int low=0;
      int high=n-1;

      while(low<=high){
        int guess=(low+high)/2;

        if(nums[guess]==target){
            return guess;
        }

        if(nums[low]<=nums[guess]){
            if(target>=nums[low] && target<nums[guess]){
                high=guess-1;
             }
             else{
                low=guess+1;
             }
        }

        else{
            if(target<=nums[high] && target>nums[guess]){
                low=guess+1;
        }
        else{
            high=guess-1;
        }
        }


      }  
      return -1;
    }
}