#include<iostream>
#include<cmath>
 
using namespace std;
 
void solve(){
    //TimeComplexity - O(n + q)
    //SpaceComplexity - O(n)
    int n , q;
    cin >> n >> q;
    int a[n] , b[n];
    
    for(int i = 0 ; i<n ; i++){
        cin>>a[i];
    }
    
    for(int i = 0 ; i<n ; i++){
        cin>>b[i];
    }
    
    int max_val = 0;
    
    for(int i = n-1 ; i>= 0 ; i--){
        max_val = max(max_val , max(a[i] , b[i]));
        a[i] = max_val;
    }
    
    int prefix[n];
    int sum = 0;
    
    for(int i = 0 ; i<n ; i++){
        sum += a[i];
        prefix[i] = sum;
    }
    
    for(int i = 0; i<q ; i++){
        int l , r;
        cin >> l >> r;
        r--;
        l--;
        int ans = prefix[r];
        if(l-1>=0){
            ans -= prefix[l-1];
        }
        cout<< ans <<" ";
    }
    cout<<"
";
    
}
 
int main(){
    int n;
    cin >> n;
    while(n){
        solve();
        n--;
    }
    return 0;
}