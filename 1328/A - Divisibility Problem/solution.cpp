#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    
    int a , b;
    cin >> a >> b;
    
    cout<<((b-a%b)%b)<<"
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