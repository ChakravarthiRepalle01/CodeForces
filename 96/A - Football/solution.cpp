#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    string s;
    cin >> s;
    int n = s.size();
    int countZero = 0;
    int countOne = 0;
    bool flagD = false;
    for(int i = 0 ; i<n ; i++){
        if(s[i]=='0'){
            countZero++;
            countOne = 0;
        }
        else{
            countOne++;
            countZero = 0;
        }
        if(countZero>=7 || countOne>=7){
            flagD = true;
        }
    }
    if(flagD) cout<<"YES"<<"
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