#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    int gcdd = 0;
    vector<int> arr(n);
    
    for(int i = 0 ; i<n ; i++){
        cin>>arr[i];
    }
    
    for(int i = 0 ; i<n ; i++){//O(n*n)
        for(int j = i+1 ; j<n ; j++){
            if(__gcd(arr[i],arr[j])<=2){
                cout<<"YES"<<"
";
                return;
            }
        }
    }
    
    cout<<"NO"<<"
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