#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , k;
    cin >> n >> k;
    
    vector<int> arr(n);
    
    for(int i = 0 ; i<n ; i++){
        cin >> arr[i];
    }
    
    sort(arr.begin() , arr.end());
    
    int maxSeq = -1;
    int seq = 1;
    for(int i = 1 ; i<n ; i++){
        if((arr[i] - arr[i-1]) <= k){
            seq++;
        }
        else{
            maxSeq = max(seq , maxSeq);
            seq = 1;
        }
    }
    maxSeq = max(maxSeq , seq);
    cout<<(n-maxSeq)<<"
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