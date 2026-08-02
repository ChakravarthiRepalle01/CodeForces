#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n ;
    char target;
    string s;
    cin >> n >> target;
    cin >> s;
    string t = s+s;
    
    if(target=='g'){
        cout<<0<<"
";
        return;
    }
    
    int idx = 0;
    int maxDist = 0;
    while(idx<2*n){
        while(idx<2*n && t[idx]!=target) idx++;
        int startidx = idx;
        while(idx<2*n && t[idx]!='g') idx++;
        if(idx<2*n) maxDist = max(maxDist , idx-startidx);
        idx++;
    }
    cout<<maxDist<<"
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