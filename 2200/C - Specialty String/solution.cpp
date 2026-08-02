#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    string s;
    cin >> s;
    
    stack<char> myStack;
    
    for(int i = 0 ; i<n ; i++){
        if(!myStack.empty()){
            if(myStack.top()==s[i]) myStack.pop();
            else myStack.push(s[i]);
        }
        else{
            myStack.push(s[i]);
        }
    }
    
    if(myStack.size()!=0) cout<<"NO"<<"
";
    else cout<<"YES"<<"
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