int missingNum(int *arr, int size) {
    // code here
    int xor1=0;
    
    for(int i=1;i<=size+1;i++){
        xor1^=i;
    }
    for(int i=0;i<size;i++){
        xor1^=arr[i];
    }
    
    return xor1;
}
