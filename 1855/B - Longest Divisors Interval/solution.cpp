#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    long long n;
    cin>>n;
    
    int cnt = 0;
    long long int i = 1 ;
    while(n%i==0){
        i++;
        cnt++;
    }
    cout<<cnt<<"
";
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