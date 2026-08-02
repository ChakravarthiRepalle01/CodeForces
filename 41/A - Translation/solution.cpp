#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    string s , t;
    cin >> s;
    cin >> t;
    int s_len = s.size();
    int t_len = t.size();
    
    if(s_len != t_len){
        cout<<"NO"<<"
";
        return;
    }
    
    int i = 0 ;
    int j = t_len-1;
    
    while(i<s_len){
        if(s[i]!=t[j]){
            cout<<"NO"<<"
";
            return;
        }
        i++;
        j--;
    }
    cout<<"YES"<<"
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