#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    
    int n;
    cin >> n;
    
    string s;
    cin >> s;
    
    set<char> hashSet;
    hashSet.insert('T');
    hashSet.insert('i');
    hashSet.insert('m');
    hashSet.insert('r');
    hashSet.insert('u');
    
    if(n!=5){
        cout<<"NO"<<"
";
        return;
    }
    else{
        for(int i = 0 ; i<5 ; i++){
            if(hashSet.count(s[i])==1){
                hashSet.erase(s[i]);
            }
            else{
                cout<<"NO"<<"
";
                return;
            }
        }
    }
    
    if(hashSet.size()==0) cout<<"YES"<<"
";
    else cout<<"NO"<<"
";
    
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n;
    cin >> n;
    while(n){
        solve();
        n--;
    }
    return 0;
}