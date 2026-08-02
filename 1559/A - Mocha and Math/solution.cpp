#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    vector<int> arr(n);
    for(int i = 0 ; i<n ; i++){
        cin >> arr[i];
    }
    
    int maxEle = -1;
    for(int i = 0 ; i<n ; i++) maxEle = max(maxEle , arr[i]);
    
    int minAns = arr[0];
    
    for(int i = 1 ; i<n ; i++) minAns =minAns&arr[i];
    
    cout<<minAns<<"
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