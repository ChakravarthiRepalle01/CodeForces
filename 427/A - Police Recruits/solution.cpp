#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    int totalUn = 0;
    int police = 0;
    
    for(int i = 0 ; i<n ; i++){
        int ele;
        cin >> ele;
        if(ele==-1){
            if(police>0) police--;
            else totalUn++;
        }
        else{
            police += ele;
        }
    }
    cout<<totalUn<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n = 1;
    // cin >> n;
    while(n){
        solve();
        n--;
    }
    return 0;
}