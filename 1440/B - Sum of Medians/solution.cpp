#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , k;
    cin >> n >> k;
    
    vector<int> nums(n*k);
    
    for(int i = 0 ; i<(n*k) ; i++){
        cin >> nums[i];
    }
    
    int median = (n-1)/2;
    int toGo = n-median;
    int lastIdx = n*k - toGo;
    
    long long sum = 0;
    for(int i = 0 ; i<k ; i++){
        sum += nums[lastIdx];
        lastIdx -= toGo;
    }
    cout<<sum<<"
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