#include<iostream>
using namespace std;
void merge(int a[],int b[],int n,int m){
    int i=0,j=0;

    while(i<n&&j<m){
        if(a[i]<b[j]){
            cout<<a[i];
            i++;
        }
        else{
            cout<<b[j];
            j++;

        }
    }
    while(i<n){
        cout<<a[i];
        i++;
    }
    while(j<m){
        cout<<b[j];
        j++;
    }

}
int main(){
    int a[]={2,3,4,5};
    int b[]={6,7,4,8};

    int n=4;
    int m=4;
    merge(a,b,n,m);
return 0;
}
