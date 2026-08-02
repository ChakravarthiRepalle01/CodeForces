#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int a , b , c;
    cin >> a >> b >>c;
    if(a==(b+c) || b==(c+a) || c==(a+b)){
        cout<<"YES"<<"
";
    }
    else cout<<"NO"<<"
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