#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    
    int n;
    cin >> n;
    string s;
    cin >> s;
 
    set<char> hashSet;
    
    for(int i = 0 ; i<n ; i++){
        char c = (char)tolower(s[i]);
        hashSet.insert(c);
    }
    
    if(hashSet.size()==26) cout<<"YES"<<"
";
    else cout<<"NO"<<"
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