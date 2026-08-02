#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    
    set<char> hashSet;
    
    string s;
    getline(cin , s);
 
    for(char c : s){
        if(c!='{' && c!='}' && c!=',' && c!=' ') hashSet.insert(c);
    }
 
    cout<<hashSet.size()<<"
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