#include<bits/stdc++.h>
 
using namespace std; // 3 2 3 2 3
 
void solve(){
    int n;
    cin >> n;
    vector<int> arr(n);
    for(int i = 0 ; i<n ; i++) cin>>arr[i];
    
    int max_left = 1;
    int max_right = 1;
    for(int i = 1 ; i<n ; i++){
        if(arr[i]==arr[0]) max_left++;
        else break;
    }
    for(int i = n-2 ; i>=0 ; i--){
        if(arr[i]==arr[n-1]) max_right++;
        else break;
    }
    if(arr[0]==arr[n-1]){
        cout<<max(0,(n-(max_left+max_right)))<<"
";
    }
    else cout<<(n - max(max_left,max_right))<<"
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