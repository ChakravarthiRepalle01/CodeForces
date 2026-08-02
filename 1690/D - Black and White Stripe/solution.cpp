#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , k;
    cin >> n >> k;
    string s;
    cin >> s;
    
    int minOp = n;    
    int b = 0;
    for(int i = 0 ; i<k ; i++){
        if(s[i]=='B') b++;
    }
 
    int l = 0;
    int r = k;
    
    while(r<n){
        minOp = min(minOp , (k-b));
        if(s[r++]=='B') b++;
        if(s[l++]=='B') b--;
    }
    minOp = min(minOp , (k-b));
    cout<<minOp<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n;
    cin >> n;
    while(n--) solve();
    return 0;
}