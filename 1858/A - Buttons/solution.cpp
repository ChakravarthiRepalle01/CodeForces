#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int a , b , c;
    cin >> a >> b >> c;
    
    if(c%2!=0) a++;
    
    if(a>b) cout<<"First"<<"
";
    else cout<<"Second"<<"
";
    
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin>>n;
    
    while(n){
        solve();
        n--;
    }
    return 0;
}