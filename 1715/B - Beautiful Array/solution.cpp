#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    long long n , k , b , s;
    cin >> n >> k >> b >> s;
    
    vector<long long> arr(n);
 
    long long reqSumForReqBeauty = b*k;
    long long currSum = s;
    arr[0] = reqSumForReqBeauty;
    currSum -= reqSumForReqBeauty;
    
    for(int i = 1 ; i<n ; i++){
        if(currSum<=0) break;
        arr[i] = min(k-1 , currSum);
        currSum -= min(currSum , k-1);
    }
    
    if(currSum>=0&&currSum<=(k-1)){
        arr[0] += currSum;
        for(int i = 0 ; i<n ; i++){
            cout<<arr[i]<<" ";
        }
        cout<<"
";
    }
    else cout<<-1<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n ;
    cin >> n;
    
    while(n--) solve();
    
    return 0;
}