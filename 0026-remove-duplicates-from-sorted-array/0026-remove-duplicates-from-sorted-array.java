class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        int officer=0;
        int cm=1;
        while(cm<n){
            if(nums[cm]!=nums[officer]){
                officer++;
                nums[officer]=nums[cm];
            }
            cm++;
        }
        return officer+1;

    }
}