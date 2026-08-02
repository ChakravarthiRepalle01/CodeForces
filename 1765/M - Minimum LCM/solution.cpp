#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    if(n%2==0) cout<<n/2<<" "<<n/2<<"
";
    else{
        int smallest = 1;
        for(int i = 2 ; i*i<=n ; i++){
            if(n%i==0){
                smallest = i;
                break;
            }
        }
        
        if(smallest==1) cout<<1<<" "<<n-1<<"
";
        else cout<<(n/smallest)<< " "<<(n-n/smallest)<<"
";
         
    }
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n;
    cin >> n;
    while(n--) solve();
    return 0;
}