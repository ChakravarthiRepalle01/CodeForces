#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , q;
    cin >> n >> q;
    
    vector<long long> arr(n);
    
    for(int i = 0 ; i<n ; i++){
        cin>>arr[i];
    }
    
    vector<long long> prefixSum(n);
    
    long long sum = 0;
    for(int i = 0 ; i<n ; i++){
        sum += arr[i];
        prefixSum[i] = sum;
    }
    
    for(int i = 0 ; i<q ; i++){
        long long l , r , k;
        cin >> l >> r >> k;
        
        long long lrSum = prefixSum[r-1] - prefixSum[l-1]+arr[l-1];
        if((prefixSum[n-1]-lrSum+(r-l+1)*k)%2!=0){
            cout<<"YES"<<"
";
        }
        else{
            cout<<"NO"<<"
";
        }
        
    }
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