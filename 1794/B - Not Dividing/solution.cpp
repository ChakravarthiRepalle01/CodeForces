#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    vector<int> arr(n);
    
    for(int i = 0 ; i<n ; i++){
        cin>>arr[i];
    }
    
    for(int i = 0 ; i<n ; i++){
        if(arr[i]==1) arr[i]++;
    }
    
    for(int i = 1 ; i<n ; i++){
        if(arr[i]%arr[i-1]==0) arr[i]++;
    }
    
    for(int i = 0 ; i<n ; i++){
        cout<<arr[i]<<" ";
    }
    cout<<"
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