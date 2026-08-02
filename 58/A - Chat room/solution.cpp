#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    string s;
    cin >> s;
    
    int h = 0;
    int l = 0;
    int e = 0;
    int o = 0;
    
    int n = s.size();
    for(int i = 0 ; i<n ; i++){
        if(s[i]=='h') h = 1;
        else if(h>0 && s[i] == 'e') e++;
        else if(e>0 && s[i] == 'l') l++;
        else if(l>1 && s[i] == 'o') o++;
    }
    
    if(h>0&&e>0&&l>1&&o>0) cout<<"YES"<<"
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