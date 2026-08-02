#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    string s;
    cin >> s;
    int n = s.size();
    
    for(int i = 1 ; i<n ; i++){
        if(s[i]>=97&&s[i]<=122){
            cout<<s<<"
";
            return;
        }
    }
    
    for(int i = 1 ; i<n ; i++){
        s[i] = (char)(s[i]+32);
    }
    
    if(s[0]>=97&&s[0]<=122){
        s[0] = (char)(s[0]-32);
    }
    else{
        s[0] = (char)(s[0]+32);
    }
    cout<<s<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n = 1;
    while(n--) solve();
    return 0;
}