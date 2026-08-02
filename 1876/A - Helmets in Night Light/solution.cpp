#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    long long n , p;
    cin >> n >> p;
    long long minCost = 0;
    vector<pair<long long , long long>> data(n);
    int noOfR = n;
    for(int i = 0 ; i<n ; i++) cin>>data[i].first;
    for(int i = 0 ; i<n ; i++) cin>>data[i].second;
    
    sort(data.begin(), data.end(), [](const pair<int, int>& a, const pair<int, int>& b) {
        return a.second < b.second; 
    });
    
    int idx = 0;
    minCost += p;
    n -= 1;
    while(n>0 && idx<noOfR && data[idx].second<p){
        long long toRem= min(n , data[idx].first);
        minCost += toRem*data[idx].second;
        n -= toRem;
        idx++;
    }
    minCost += n*p;
    cout<<minCost<<"
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