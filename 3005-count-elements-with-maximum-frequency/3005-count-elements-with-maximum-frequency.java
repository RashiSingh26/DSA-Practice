class Solution {
    public int maxFrequencyElements(int[] nums) {
       
        int n=nums.length;
        boolean[] visited=new boolean[n];
        int max=0;
        int ans=0;

        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
                int count=0;
                for(int j=i;j<n;j++){
                    if(nums[i]==nums[j]){
                        count++;
                        visited[j]=true;
                    }
                }
                
            if(count>max){
                max=count;
                ans=count;

            }
            else if(count==max){
                ans+=count;
            }

        }
        return ans;
    }
}