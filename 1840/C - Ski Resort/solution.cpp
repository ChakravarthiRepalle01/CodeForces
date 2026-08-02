#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , k , q;
    cin >> n >> k >> q;
    
    vector<int> arr(n);
    for(int i = 0 ; i<n ; i++) cin >> arr[i];
    
    int i = 0;
    int j = 0;
    long long totalWays = 0;
    
    while(i<n&&j<n){
        while(i<n && arr[i]>q) i++;
        j = i+1;
        while(j<n && arr[j]<=q) j++;
        int n1 = j-i;
        long long ways = (1LL*(n1-k+1)*(n1-k+2))/2;
        if(ways>0&&i<n&&j<=n&&k<=n1) totalWays += ways;
        i = j+1;
    }
    cout<<totalWays<<"
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