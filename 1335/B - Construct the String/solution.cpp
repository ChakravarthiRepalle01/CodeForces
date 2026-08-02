#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , a , b;
    cin >> n >> a >> b;
    string ans = "";
    for(int i = 0 ; i<n ; i++){
        ans += char(97+i%b);
    }
    cout<<ans<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n;
    cin >> n;
    while(n){
        solve();
        n--;
    }
    return 0;
}