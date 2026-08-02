#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    long long a , b;
    cin >> a >> b;
    
    if(a == b) cout<<0<<" "<<0<<"
";
    else{
        long long maxGCD = abs(a-b);
        long long rem_a = a%maxGCD;
        long long noOfSteps = min(maxGCD - rem_a , rem_a);
        cout<<maxGCD<<" "<<noOfSteps<<"
";
    }
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin>>n;
    
    while(n){
        solve();
        n--;
    }
    return 0;
}