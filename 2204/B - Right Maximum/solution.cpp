#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    vector<pair<int,int>> arr(n);
    for(int i = 0 ; i<n ; i++){
        int ele;
        cin >> ele;
        arr[i] = {ele , i};
    }
    
    sort(arr.begin(), arr.end(), [](const pair<int, int>& a, const pair<int, int>& b) {
        if (a.first != b.first) {
            return a.first > b.first;
        }
        return a.second > b.second;
    });
    int cnt = 1;
    int prevSec = arr[0].second;
    for(int i = 1 ; i<n ; i++){
        if(arr[i].second<prevSec){
            cnt++;
            prevSec = arr[i].second;
        }
    }
    cout<<cnt<<"
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