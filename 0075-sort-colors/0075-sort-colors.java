class Solution {
    public void sortColors(int[] nums) {
       int n=nums.length;
       int p1=0;
       for(int i=0;i<n;i++){
        if(nums[i]==0){
            int temp=nums[p1];
            nums[p1]=nums[i];
            nums[i]=temp;
            p1++;
        }
       }
       int p2=n-1;
       for(int i=n-1;i>=0;i--){
        if(nums[i]==2){
            int temp=nums[p2];
            nums[p2]=nums[i];
            nums[i]=temp;
            p2--;
        }
       }
    }
}