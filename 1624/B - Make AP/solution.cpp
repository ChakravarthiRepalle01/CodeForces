#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int a , b , c;
    
    cin>>a>>b>>c;
 
    int new_a = 2*b-c;
    int new_c = 2*b-a;
    int new_b = (a+c)/2;
    if(new_a>0 && new_a%a==0) cout<<"YES"<<"
";
    else if(new_b>0 && (a+c)%2==0 && new_b%b==0) cout<<"YES"<<"
";
    else if(new_c>0 && new_c%c==0) cout<<"YES"<<"
";
    else cout<<"NO"<<"
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