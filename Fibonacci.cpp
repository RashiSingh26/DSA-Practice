#include<iostream>
using namespace std;
void fib(int n){
    int a=0;
    int b=1;
    cout<<a<<" "<<b<<" "<<endl;
   
    for(int i=2;i<n;i++){
        int temp=a+b;
        a=b;
        b=temp;
cout<<temp<<" ";
    }
    
    
}
int main(){
    int n;
    cout<<"Enter the number"<<endl;
    cin>>n; 
    fib(n);
return 0;
}
