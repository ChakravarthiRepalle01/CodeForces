#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int x , k;
    cin >> x >> k;
    
    if(x%k!=0){
        cout<<1<<"
";
        cout<<x<<"
";
    }
    else{
        cout<<2<<"
";
        cout<<x-1<<" "<<1<<"
";
    }
    
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