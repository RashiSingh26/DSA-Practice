class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer> result=new ArrayList<>();
        
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<n;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                result.add(arr[i]);
            }
            
        }
        return result;
       
    }
}
