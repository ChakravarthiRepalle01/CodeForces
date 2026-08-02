#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    long long n;
    cin >> n;
    
    if(n%2==0){
        //n=6 -1 + 2 - 3 + 4 - 5 + 6
        cout<<n/2<<"
";
    }
    else{
        //n = 7 -1 + 2 - 3 + 4 - 5 + 6 - 7
        cout<<((n-1)/2-n)<<"
";
    }
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n =  1;
    // cin >> n;
    while(n){
        solve();
        n--;
    }
    return 0;
}