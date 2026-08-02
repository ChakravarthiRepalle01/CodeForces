#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    
    set<char> hashSet;
    hashSet.insert('c');
    hashSet.insert('o');
    hashSet.insert('d');
    hashSet.insert('e');
    hashSet.insert('f');
    hashSet.insert('r');
    hashSet.insert('s');
    
    char c;
    cin >> c;
    
    if(hashSet.count(c)==1) cout<<"YES"<<"
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