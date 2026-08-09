class Solution {
    public int removeDuplicates(int[] nums) {
    int n=nums.length;
    int cm=1;
    int officer=0;
    while(cm<n){
        if(nums[cm]!=nums[officer]){
            officer++;
            nums[officer]=nums[cm];
        }
        else{
            cm++;
        }
    }
    return officer+1;
    }

}