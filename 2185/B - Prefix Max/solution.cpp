#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    int maxEle = -1;
    for(int i = 0 ; i<n ; i++){
        int ele;
        cin >> ele;
        maxEle = max(maxEle , ele);
    }
    cout<<maxEle*n<<"
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