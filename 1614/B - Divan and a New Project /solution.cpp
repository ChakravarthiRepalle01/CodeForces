#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    vector<pair<int,int>> noOfVisits(n);
    
    for(int i = 0 ; i<n ; i++){
        int ele;
        cin >> ele;
        noOfVisits[i] = {ele,i+1};
    }
    
    sort(noOfVisits.begin() , noOfVisits.end() , [](const pair<int,int>& a, const pair<int,int>& b){
        return a.first>b.first;
    });
    
    int startIdx = -1;
    int endIdx = 1;
    int currIdx = 0;
    vector<int> ans(n+1);
    
    while(currIdx<n){
        ans[noOfVisits[currIdx].second] = startIdx;
        currIdx++;
        startIdx--;
        if(currIdx<n){
            ans[noOfVisits[currIdx].second] = endIdx;
            currIdx++;
            endIdx++;
        }
    }
    
    long long totMin = 0;
    for(int i = 0 ; i<n ; i++){
        totMin += 1LL*(noOfVisits[i].first)*abs(ans[noOfVisits[i].second]);
    }
    cout<<1ll*2*totMin<<"
";
    cout<<0<<" ";
    for(int i = 1 ; i<=n ; i++){
        cout<<ans[i]<<" ";
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