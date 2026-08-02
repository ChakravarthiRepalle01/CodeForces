#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    long long n;
    cin >> n;
    long long totalDigits = 0;
    while(n>0){
        long long k = n%10;
        n /= 10;
        if(k==4 || k==7) totalDigits++;
    }
    n = totalDigits;
    if(n==4 || n==7) cout<<"YES"<<"
";
    else cout<<"NO"<<"
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