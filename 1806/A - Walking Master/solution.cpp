#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int a , b , c , d;
    cin >> a >> b >> c >> d;
    int op = 0;
    
    if(b>d){
        cout<<-1<<"
";
        return;
    }
    
    int equSecond = d-b;
    
    a += equSecond;
    b += equSecond;
    
    if(c>a){
        cout<<-1<<"
";
        return;
    }
    
    int equFirst = a-c;
    op  = equSecond + equFirst;
    
    cout<<op<<"
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