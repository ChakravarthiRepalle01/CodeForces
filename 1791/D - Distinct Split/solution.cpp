#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    string s;
    cin >> n;
    cin >> s;
    
    set<char> hashSet;
    vector<long long> ltr(n-1);
    vector<long long> rtl(n-1);
    
    for(int i = 0 ; i<n-1 ; i++){
        hashSet.insert(s[i]);
        ltr[i] = hashSet.size();
    }
    hashSet.clear();
    for(int i = n-1 ; i>=1 ; i--){
        hashSet.insert(s[i]);
        rtl[i-1] = hashSet.size();
    }
    
    long long maxCnt = 0;
    for(int i = 0 ; i<n-1 ; i++){
        maxCnt = max(maxCnt , ltr[i]+rtl[i]);
    }
    cout<<maxCnt<<"
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