#include<iostream>
#include<cmath>
 
using namespace std;
 
void solve(){
    int n;
    cin>>n;
 
    int remainder = n%15;
    int lastFifften = n-remainder;
    int noOfFifften = lastFifften/15+1;
    
    int ans = 3*noOfFifften;
    if(remainder==0){
        ans -=2;
    }
    else if(remainder==1){
        ans--;
    }
 
    cout<<ans<<"
";
}
 
int main(){
    int noOfTestCases;
    cin >> noOfTestCases;
    
    while(noOfTestCases){
        solve();
        noOfTestCases--;
    }
    return 0;
}