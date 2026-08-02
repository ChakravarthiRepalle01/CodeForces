#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    vector<int> arr(7);
    int sum = 0;
    for(int i = 0 ; i<7 ; i++){
        cin >> arr[i];
        sum = sum + (-1*arr[i]);
    }
    
    int maxSum = INT_MIN;
    for(int i = 0 ; i<7 ; i++){
        maxSum = max(maxSum , sum + 2*arr[i]);
    }
    
    cout<<maxSum<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n;
    cin >> n;
    while(n){
        solve();
        n--;
    }
    return 0;
}