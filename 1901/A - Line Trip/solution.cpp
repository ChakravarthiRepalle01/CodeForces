#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , x ;
    cin >>n;
    cin>>x;
    
    vector<int> arr(n);
    
    for(int i = 0 ; i<n ; i++){
        cin >> arr[i];
    }
    
    int maxDist = arr[0];
    for(int i = 1 ; i<n ; i++){
        maxDist = max(maxDist , (arr[i] - arr[i-1]));
    }
    maxDist = max(maxDist , 2*(x-arr[n-1]));
    
    cout<<maxDist<<"
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