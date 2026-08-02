#include<iostream>
 
using namespace std;
 
void solve(){
    int x , y;
    cin>>x>>y;
    if(y<=(x+1) && (x+1-y)%9==0){
        cout<<"YES"<<"
";
    }
    else{
        cout<<"NO"<<"
";
    }
}
 
int main(){
    int noOfTestCases;
    cin>>noOfTestCases;
    
    while(noOfTestCases){
        solve();
        noOfTestCases--;
    }
    return 0;
}