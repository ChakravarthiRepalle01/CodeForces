#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    int q = n/2020;
    int r = n%2020;
    
    if(q>=r) cout<<"YES"<<"
";
    else cout<<"NO"<<"
";
    
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n;
    cin >> n;
    
    while(n--) solve();
    
    return 0;
}