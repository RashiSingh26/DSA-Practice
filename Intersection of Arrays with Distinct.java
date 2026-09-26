import java.util.*;
class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        int n=a.length;
        int m=b.length;
        int count=0;
        int i=0,j=0;
        
        while(i<n && j<m){
            if(a[i]==b[j]){
                count++;
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return count;
    }
}
