#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    string s;
    cin >> n;
    cin >> s;
    
    int maxConsFreq = 1;
    char lastChar = s[n-1];
    
    for(int i = n-2 ; i>=0 ; i--){
        if(s[i]!=lastChar) break;
        maxConsFreq++;
    }
    
    int maxFreq = 0;
    for(int i = 0 ; i<n ; i++) if(s[i]==lastChar) maxFreq++;
    maxFreq -= maxConsFreq;
    
    cout<<(n-maxFreq-maxConsFreq)<<"
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