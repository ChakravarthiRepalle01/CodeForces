#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    string prev;
    cin >> prev;
    
    int maxCount = 1;
    int cnt = 1;
    for(int i = 1 ; i<n ; i++){
        string curr;
        cin >> curr;
        
        if(prev!=curr){
            maxCount++;
        }
        prev = curr;
    }
    cout<<maxCount<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n =  1;
    // cin >> n;
    while(n){
        solve();
        n--;
    }
    return 0;
}