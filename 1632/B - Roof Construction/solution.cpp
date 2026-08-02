#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    int k = log2(n-1);
    int highSetBit = pow(2,k);
    
    for(int i = highSetBit-1 ; i>=1 ; i--){
        cout<<i<<" ";
    }
    cout<<0<<" ";
    for(int i = highSetBit ; i<n ; i++){
        cout<<i<<" ";
    }
    cout<<"
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