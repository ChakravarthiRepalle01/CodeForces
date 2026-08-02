#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    vector<int> arr(n);
    
    int minK = 0;
    
    for(int i =  0 ; i<n ; i++){
        cin >> arr[i];
        minK = gcd(minK , abs(arr[i]-i-1));
    }
    
    cout<<minK<<"
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