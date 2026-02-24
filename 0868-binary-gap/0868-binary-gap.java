class Solution {
    public int binaryGap(int n) {
        String bin=Integer.toBinaryString(n);
        int index=-1;
        int max=0;

        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1'){
                if(index!=-1){
                    max=Math.max(max,i-index);
                }
                index=i;
            }

        }  
        return max; 
         }
}