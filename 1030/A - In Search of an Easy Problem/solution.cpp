#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    int sum = 0;
    for(int i = 0 ; i<n ; i++){
        int ele ;
        cin >> ele;
        sum += ele;
    }
    if(sum>0) cout<<"HARD"<<"
";
    else cout<<"EASY"<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n = 1;
    while(n){
        solve();
        n--;
    }
    return 0;
}