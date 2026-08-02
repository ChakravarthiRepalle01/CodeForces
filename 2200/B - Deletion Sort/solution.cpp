#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    vector<int> arr(n);
    bool flag = false;
    for(int i = 0 ; i<n ; i++){
        cin >> arr[i];
    }
    
    for(int i = 0 ; i<n-1 ; i++){
        if(arr[i]>arr[i+1]) flag = true;
    }
    
    if(flag) cout<<1<<"
";
    else cout<<n<<"
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