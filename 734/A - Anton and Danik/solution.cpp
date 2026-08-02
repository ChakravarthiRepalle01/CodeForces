#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    string s;
    cin >> s;
    int dcnt = 0;
    int acnt = 0;
    for(int i = 0 ; i<n ; i++){
        if(s[i]=='A') acnt++;
        else dcnt++;
    }
    if(acnt>dcnt) cout<<"Anton"<<"
";
    else if(dcnt>acnt) cout<<"Danik"<<"
";
    else cout<<"Friendship"<<"
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