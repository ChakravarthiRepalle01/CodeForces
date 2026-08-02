#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    vector<int> arr(n);
    for(int i = 0 ; i<n ; i++) cin >> arr[i];
    vector<int> ans(n);
    int idx = 0;
    while(idx<n){
        int cnt = 1;
        int startIdx = idx;
        int currEle = arr[idx++];
        while(idx<n && arr[idx]==currEle){
            idx++;
            cnt++;
        }
        
        if(cnt<2){
            cout<<-1<<"
";
            return;
        }
        
        for(int i = 1 ; i<cnt ; i++){
            ans[startIdx+i-1] = (startIdx+1+i);
        }
        ans[startIdx+cnt-1] = (startIdx+1);
        
    }
    
    for(int i = 0 ; i<n ; i++){
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