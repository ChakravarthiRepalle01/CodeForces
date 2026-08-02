#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    int res = INT_MAX;
    
    while(n>0){
        int k = n%10;
        n/=10;
        res = min(res , k);
    }
    cout<<res<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n ;
    cin >> n;
    while(n){
        solve();
        n--;
    }
    return 0;
}