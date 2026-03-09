class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        int suff[]=new int[n];


    
prefix[0]=0;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i-1];

        }

        suff[n-1]=0;
        for(int i=n-2;i>=0;i--){
            suff[i]=suff[i+1]+nums[i+1];
        }
        for(int i=0;i<n;i++){
            if(prefix[i]==suff[i]){
                return i;
            }

        }
return -1;
    }
}
