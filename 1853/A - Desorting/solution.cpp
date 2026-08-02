#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    int prev;
    cin >> prev;
    
    bool flag = false;
    int minOperations = INT_MAX;
    
    for(int i = 1 ; i<n ; i++){
        int ele;
        cin >> ele;
        
        if(ele<prev){
            flag = true;
        }
        minOperations = min(minOperations , (ele-prev)/2 + 1);
        prev = ele;
    }
    
    if(flag == true || minOperations==INT_MAX){
        cout<<0<<"
";
    }
    else{
        cout<<minOperations<<"
";
    }
    
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