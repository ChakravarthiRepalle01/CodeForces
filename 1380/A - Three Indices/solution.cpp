#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    vector<int> nums(n);
    
    for(int i = 0 ; i<n ; i++) cin>>nums[i];
    
    for(int i = 1 ; i<n-1 ; i++){
        if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
            cout<<"YES"<<"
";
            cout<<i<<" "<<i+1<<" "<<i+2<<"
";
            return;
        }
    }
    cout<<"NO"<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin >> n;
    
    while(n--) solve();
    
    return 0;
}