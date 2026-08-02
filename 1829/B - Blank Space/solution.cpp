#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n ;
    cin >> n ;
    
    int maxCount = 0;
    int count = 0;
    
    for(int i = 0 ; i<n ; i++){
        int ele;
        cin >> ele;
        
        if(ele==0){
            count++;
        }
        else{
            maxCount = max(maxCount , count);
            count = 0;
        }
    }
    cout<<max(count , maxCount)<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin >> n ;
    
    while(n){
        solve();
        n--;
    }
    return 0;
}