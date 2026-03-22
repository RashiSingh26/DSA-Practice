import java.util.*;
class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        int n=stalls.length;
        Arrays.sort(stalls);
        int low=1;
        int high=stalls[n-1]-stalls[0];
        int res=-1;
        while(low<=high){
            int guess=(low+high)/2;
            
            if(fun(stalls,k,n,guess)){
                res=guess;
                low=guess+1;
            }
            else{
                high=guess-1;
            }
            }
            return res;
        
    }
    
     public boolean fun(int[] stalls, int k,int n,int guess){
         int cow=1;
         int pos=stalls[0];
         for(int i=0;i<n;i++){
             int dist=stalls[i]-pos;
             if(dist<guess)
                 continue;
                 cow++;
                 pos=stalls[i];
             
         }
         if(cow>=k){
             return true;
         }
         else{
             return false;
         }
     }
}
