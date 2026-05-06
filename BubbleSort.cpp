#include<iostream>
using namespace std;

void bubble(int arr[],int n){
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}

int main(){
    int n;
    cout<<"Enter the length og array"<<endl;
    cin>>n;
    int arr[n];
    cout<<"Enter Array elements:"<<endl;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
     bubble(arr,n);
    cout<<"Array Elements:"<<endl;
    for(int i=0;i<n;i++){
        cout<<arr[i];   
     }
     
    return 0;
}
