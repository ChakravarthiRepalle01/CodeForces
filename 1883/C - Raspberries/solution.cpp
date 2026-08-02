#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , k;
    cin >> n >> k;
    
    int minDiff = INT_MAX;
    int noOfEven = 0;
    for(int i = 0 ; i<n ; i++){
        int ele;
        cin >> ele;
        
        if(ele%2==0) noOfEven++;
        minDiff = min(minDiff , (k-ele%k)%k);
    }
    
    if(k==4){
        if(noOfEven>=2) cout<<0<<"
";
        else cout<<min(minDiff , 2-noOfEven)<<"
";
    }
    else cout<<minDiff<<"
";
    
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin >> n;
    
    while(n--) solve();
    
    return 0;
}