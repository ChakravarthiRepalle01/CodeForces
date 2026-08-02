#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , k , l , c , d , p , nl , np;
    cin >> n >> k >> l >> c >> d >> p >> nl >> np;\
    
    cout<<min((k*l)/nl , min(p/np , c*d))/n<<"
";
    
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n = 1;
    // cin >> n;
    while(n){
        solve();
        n--;
    }
    return 0;
}