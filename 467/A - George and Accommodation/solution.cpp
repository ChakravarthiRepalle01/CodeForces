#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    int count = 0;
    while(n>0){
        int a , b;
        cin >> a >> b;
        
        if((b-a)>=2) count++;
        
        n--;
    }
    cout<<count<<"
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