#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    vector<int> arr(n);
    
    for(int i = 0 ; i<n ; i++) cin>>arr[i];
    
    if(arr[0]!=arr[1] && arr[1] == arr[2]){
        cout<<1<<"
";
        return;
    }
    else if(arr[n-1]!=arr[n-2] && arr[n-2] == arr[n-3]){
        cout<<(n)<<"
";
        return;
    }
    
    for(int i = 1 ; i<=(n-2) ; i++){
        if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){
            cout<<(i+1)<<"
";
            return;
        }
    }
    
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n;
    cin >> n;
    while(n){
        solve();
        n--;
    }
    return 0;
}