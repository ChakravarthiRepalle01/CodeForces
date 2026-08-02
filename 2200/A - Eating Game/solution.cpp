#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    int maxEle = -1;
    int maxCnt = 0;
    
    for(int i = 0 ; i<n ; i++){
        int ele;
        cin >> ele;
        if(ele==maxEle) maxCnt++;
        else if(ele>maxEle){
            maxEle = ele;
            maxCnt = 1;
        }
    }
    cout<<maxCnt<<"
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