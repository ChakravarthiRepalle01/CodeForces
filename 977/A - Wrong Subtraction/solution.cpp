#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , k;
    cin >> n >> k;
    for(int i = 0 ; i<k ; i++){
        if(n%10==0){
            n /= 10;
        }
        else{
            n--;
        }
    }
    cout<<n<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n = 1;
    while(n){
        solve();
        n--;
    }
    return 0;
}