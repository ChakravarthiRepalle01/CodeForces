#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    string s;
    cin >> s;
    
    int n = s.size();
    int i = 0 ;
    int op = 0;
    stack<char> st;
    
    while(i<n){
        if(st.empty()) st.push(s[i]);
        else{
            if(st.top()=='0'&&s[i]=='1' || st.top()=='1'&&s[i]=='0'){
                st.pop();
                op++;
            }
            else st.push(s[i]);
        }
        i++;
    }
    if(op%2!=0) cout<<"DA"<<"
";
    else cout<<"NET"<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin >> n;
    
    while(n--) solve();
    
    return 0;
}