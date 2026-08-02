#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    string s , t;
    cin >> s >> t;
    int tlen = t.size();
    int slen = s.size();
    
    vector<int> reqChars(26);
    string finalOut = "";
    
    for(int i = 0 ; i<tlen ; i++) {
        reqChars[t[i]-'A']++;
    }
    
    for(int i = (slen-1) ; i>=0 ; i--){
        if(reqChars[s[i]-'A']>0){
            finalOut = s[i] + finalOut;
            reqChars[s[i]-'A']--;
        }
    }
    
    if(finalOut==t) cout<<"YES"<<"
";
    else cout<<"NO"<<"
";
    
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin>>n;
    
    while(n){
        solve();
        n--;
    }
    return 0;
}