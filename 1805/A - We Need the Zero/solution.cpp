#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    int xorr = 0;
    for(int i = 0 ; i<n ; i++){
        int ele;
        cin >> ele;
        xorr = xorr ^ ele;
    }
    
    if(n%2==0){
        if(xorr==0) cout<<xorr<<"
";
        else cout<<-1<<"
";
    }
    else cout<<xorr<<"
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