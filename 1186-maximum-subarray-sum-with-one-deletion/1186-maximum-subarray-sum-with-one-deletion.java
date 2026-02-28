class Solution {
    public int maximumSum(int[] arr) {
        int n=arr.length;
        int nodel=arr[0];
        int onedel=arr[0];
        int res=arr[0];

        for(int i=1;i<n;i++){
            int prenodel=nodel;

            nodel=Math.max(arr[i],nodel+arr[i]);
            onedel=Math.max(prenodel,onedel+arr[i]);

            res=Math.max(res,Math.max(nodel,onedel));
        }
        return res;

        }
    }