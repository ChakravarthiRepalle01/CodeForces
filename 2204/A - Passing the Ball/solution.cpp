#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    string s;
    cin >> s;
    set<int> hashSet;
    int i = 0;
    int cnt = 1;
    while(cnt<=n){
        hashSet.insert(i);
        if(s[i]=='R') i++;
        else i--;
        cnt++;
    }
    cout<<hashSet.size()<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin >> n;
    
    while(n){
        solve();
        n--;
    }
    return 0;
}