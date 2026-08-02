#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    vector<int> arr(n);
    
    for(int i = 0 ; i<n ; i++){
        cin >> arr[i];
    }
    
    sort(arr.rbegin() , arr.rend());
    
    if(1!=(n-1)){
        arr[1] = arr[1] + arr[n-1];
        arr[n-1] = arr[1] - arr[n-1];
        arr[1] = arr[1] - arr[n-1];
    }
    
    if(arr[0]==arr[1]){
        cout<<"NO"<<"
";
    }
    else{
        cout<<"YES"<<"
";
        for(int i = 0 ; i<n ; i++){
            cout<<arr[i]<<" ";
        }
        cout<<"
";
    }
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