class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1;
        int high=0;
        int res=high;

        for(int i=0;i<n;i++){
            if(piles[i]>high){
                high=piles[i];
            }
        }
res=high;
        while(low<=high){
            int guess=(low+high)/2;
            long hour=fun(piles,guess);
            if(hour>h){
                low=guess+1;

            }
            else{
                res=guess;
                high=guess-1;
            }
        }
        return res;
        
    }
    public long fun(int[] piles,int speed){
        long h=0;
        for(int i=0;i<piles.length;i++){
            h+=piles[i]/speed;
            if(piles[i]%speed!=0){
                h++;
            }
        }
        return h;

    }
}