#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    long long n;
    cin >> n;
    
    if(n&(n-1)) cout<<"YES"<<"
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