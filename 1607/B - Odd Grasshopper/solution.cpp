#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    long long x , n;
    
    cin >> x >> n;
    
    long long m = n/2 + 1;
    
    long long sum_n = (pow(-1 , m-1) * (4*m-1) - 1)/2;
    
    if(n%2==0){
        if(m%2==0){
            sum_n += (n+1);
        }
        else{
            sum_n -= (n+1);
        }
    }
    
    if(x%2==0) cout<<(x-sum_n)<<"
";
    else cout<<(x+sum_n)<<"
";
    
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