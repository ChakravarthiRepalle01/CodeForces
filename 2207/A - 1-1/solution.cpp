#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    string s;;
    cin >> s;
    
    int i = 0;
    int j = 2;
    while(j<n){
        if(s[i]=='1' && s[j]=='1') s[i+1] = '1';
        i++;
        j++;
    }
    
    int oneCntmax = 0;
    int oneCntmin = 0;
    
    for(int i = 0 ; i<n ; i++){
        if(s[i]=='1') oneCntmax++;
    }
    
    i = 0;
    j = 2;
    while(j<n){
        if(s[i]=='1' && s[j]=='1') s[i+1] = '0';
        i++;
        j++;
    }
    
    for(int i = 0 ; i<n ; i++){
        if(s[i]=='1') oneCntmin++;
    }
    cout<<oneCntmin<<" "<<oneCntmax<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin >> n;
    
    while(n){
        solve();
        n--;
    }
    return 0;
}