#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    vector<int> arr(n);
    
    for(int i = 0 ; i<n; i++){
        cin >> arr[i];
    }
    
    int minEle = 1000;
    int maxEle = 0;
    
    for(int i = 0 ; i<n ; i++){
        minEle = min(minEle , arr[i]);
        maxEle = max(maxEle , arr[i]);
    }
    
    int maxDiff = arr[n-1]-arr[0];
    
    for(int i = 0 ; i<(n-1) ; i++){
        maxDiff = max(maxDiff , (arr[i]-arr[i+1]));
    }
    
    maxDiff = max(maxDiff , (maxEle - arr[0]));
    maxDiff = max(maxDiff , (arr[n-1]-minEle));
    
    cout<<maxDiff<<"
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