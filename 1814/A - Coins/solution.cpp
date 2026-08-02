#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    long long n , k;
    cin >> n >> k;
    
    if(n%2==0){
        cout<<"YES"<<"
";
    }
    else{
        if(k%2==0){
            cout<<"NO"<<"
";
        }
        else{
            cout<<"YES"<<"
";
        }
    }
    
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin>>n;
    
    while(n){
        solve();
        n--;
    }
    return 0;
}