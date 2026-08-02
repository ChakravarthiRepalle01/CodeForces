#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int a , b , c;
    cin >> a >> b >> c;
    int maxEle = max(a , max(b,c));
    int minEle = min(a , min(b,c));
    cout<<(a+b+c-maxEle-minEle)<<"
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