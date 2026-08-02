#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    string s;
    cin >> s;
    
    int n = s.size();
    
    int zeroCnt = 0;
    int oneCnt = 0;
    
    for(int i = 0 ; i<n ; i++){
        if(s[i]=='0') zeroCnt++;
        else oneCnt++;
    }
    
    for(int i = 0 ; i<n ; i++){
        if(s[i]=='1'){
            if(zeroCnt!=0) zeroCnt--;
            else break;
        }
        else{
            if(oneCnt!=0) oneCnt--;
            else break;
        }
    }
    cout<<(zeroCnt+oneCnt)<<"
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