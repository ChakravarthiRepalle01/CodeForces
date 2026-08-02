#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int k , n ,w;
    cin >> k >> n >> w;
    int borr = (k*w*(w+1)*0.5) - n;
    if(borr<=0) cout<<0<<"
";
    else cout<<borr<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n = 1;
    while(n){
        solve();
        n--;
    }
    return 0;
}