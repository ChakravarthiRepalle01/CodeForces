#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    int noOfOdd = 0;
    for(int i = 0 ; i<n ; i++){
        int ele;
        cin >> ele;
        if(ele%2!=0) noOfOdd++;
    }
    
    if(noOfOdd%2==0) cout<<"YES"<<"
";
    else cout<<"NO"<<"
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