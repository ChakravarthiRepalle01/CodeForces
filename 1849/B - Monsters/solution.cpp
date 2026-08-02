#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , k;
    cin >> n >> k;
    
    vector<int> arr(n);
    
    for(int i = 0 ; i<n ; i++) cin>>arr[i];
    
    for(int i = 0 ; i<n ; i++){
        arr[i] = arr[i]%k;
        if(arr[i]==0) arr[i] = k;
    }
    
    vector<pair<int,int>> ans(n);
    for(int i = 0 ; i<n ; i++){
        ans[i] = {i+1 , arr[i]};
    }
    
    sort(ans.begin(), ans.end(), [](const pair<int, int>& a, const pair<int, int>& b) {
        if (a.second != b.second) {
            return a.second > b.second; 
        }
        return a.first < b.first;
    });
    
    for(int i = 0 ; i<n ; i++){
        cout<<ans[i].first<<" ";
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