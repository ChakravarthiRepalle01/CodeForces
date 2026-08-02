#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    long long finalGCD = 0;
    for(int i = 0 ; i<n ; i++){
        long long ele;
        cin>>ele;
        finalGCD = gcd(finalGCD , ele);
    }
    
    for(long long i = 2 ; i <= 1000000000000000000LL ; i++){
        if(gcd(i,finalGCD)==1){
            cout << i <<"
";
            return;
        }
    }
    cout<<-1<<"
";
}
 
int gcd(long long a , long long b){
    if(a ==  0) return b;
    return gcd(b%a , a);
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