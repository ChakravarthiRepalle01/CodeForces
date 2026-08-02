#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int a , b;
    cin >> a >> b;
    int years = 0;
    while(a<=b){
        years++;
        a *= 3;
        b*= 2;
    }
    cout<<years<<"
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