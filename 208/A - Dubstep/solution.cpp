#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    string s;;
    cin >> s;
    string ans = "";
    
    int n = s.size();
    for(int i = 0 ; i<n ; i++){
        bool flag = false;
        if(s[i]=='W'){
            if((n-i)>=3){
                if(s[i+1]=='U'&&s[i+2]=='B') {
                    i+= 2;
                    if(ans.size()!=0 && (i!=(n-1))) ans += " ";
                    flag = true;
                }
            }
        }
        if(!flag) ans = ans+s[i];
    }
    cout<<ans<<"
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