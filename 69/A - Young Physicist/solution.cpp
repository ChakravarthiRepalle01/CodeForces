#include<iostream>
 
using namespace std;
 
int main(){
    
    int n;
    cin >> n;
    long x = 0 , y = 0 , z = 0;
    for(int i = 0 ; i<n ; i++){
        int a , b , c;
        cin >> a >>b >>c;
        x+=(long)a;
        y+=(long)b;
        z+=(long)c;
    }
    
    if(x==0 && y==0 && z==0){
        cout<<"YES";
    }
    else{
        cout<<"NO";
    }
}