#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int a , b;
    cin >> a >> b;
    
    int diff = abs(a-b);
    int ops = diff/10;
    if(diff%10!=0) ops++;
    
    cout<<ops<<"
";
    
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n;
    cin >> n;
    while(n){
        solve();
        n--;
    }
    return 0;
}