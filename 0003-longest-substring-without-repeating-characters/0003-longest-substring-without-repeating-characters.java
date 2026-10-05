class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n=s.length();
      boolean[] present=new boolean[256];

      int left=0;
      int maxcount=0;
      for(int i=0;i<n;i++){
        while(present[s.charAt(i)]){
            present[s.charAt(left)]=false;
             left++;
        }
       
        present[s.charAt(i)]=true;
        maxcount=Math.max(maxcount,i-left+1);
      }
      return maxcount;
    }
}