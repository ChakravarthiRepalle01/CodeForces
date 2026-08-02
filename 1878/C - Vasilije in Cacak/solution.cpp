#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    long long n , k , x;
    cin >> n >> k >> x;
    
    long long minSum = k*(k+1)/2;
    long long maxSum = (n*(n+1) - (n-k)*(n-k+1))/2;
    
    if(minSum<=x && maxSum>=x) cout<<"YES"<<"
";
    else cout<<"NO"<<"
";
    
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin >> n;
    
    while(n){
        solve();
        n--;
    }
    return 0;
}