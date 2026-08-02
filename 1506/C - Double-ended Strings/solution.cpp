#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    string s;
    string t;
    cin >> s;
    cin >> t;
    int a = s.size();
    int b = t.size();
    int maxLen = 0;
    for(int len = 1 ; len<=a ; len++){
        for(int i = 0 ; i<(a-len+1) ; i++){
            for(int j = 0 ; j<(b-len+1) ; j++){
                if(s.substr(i,len)==t.substr(j,len)){
                    maxLen = max(maxLen , len);
                }
            }
        }
    }
    cout<<(a+b-2*maxLen)<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n ;
    cin >> n;
    while(n--){
        solve();
    }
    return 0;
}