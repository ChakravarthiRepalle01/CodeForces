#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    string ans = "I hate";
    
    int flag = 1;
    
    for(int i = 1 ; i<n ; i++){
        if(flag==1){
            ans = ans + " that I love";
        }
        else{
            ans = ans + " that I hate";
        }
        flag = abs(flag-1);
    }
    ans = ans + " it";
    cout<<ans<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n =  1;
    // cin >> n;
    while(n){
        solve();
        n--;
    }
    return 0;
}