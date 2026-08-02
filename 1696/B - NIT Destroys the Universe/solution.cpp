#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    vector<int> arr(n);
    
    for(int i = 0 ; i<n ; i++){
        cin >> arr[i];
    }
    
    int prev = 0;
    int curr = -1;
    int count = 0;
    
    for(int i = 0 ; i<n; i++){
        curr = arr[i];
        if(prev==0 && curr!=0) count++;
        prev = curr;
    }
    if(count>2) count=2;
    cout<<count<<"
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