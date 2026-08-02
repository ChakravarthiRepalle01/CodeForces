#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    string s;
    cin >> s;
    
    if(s[0]>=97&&s[0]<=122) s[0] = (char)(s[0]-32);
    
    cout<<s<<"
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