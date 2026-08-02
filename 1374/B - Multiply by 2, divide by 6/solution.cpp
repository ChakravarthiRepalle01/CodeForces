#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    int op3 = 0;
    int op2 = 0;
    
    while(n>1 && n%2==0){
        op2++;
        n /= 2;
    }
    
    while(n>1 && n%3==0){
        op3++;
        n /= 3;
    }
    
    if(op3>=op2){
        if(n==1){
            cout<<(2*op3-op2)<<"
";
        }
        else cout<<-1<<"
";
    }
    else cout<<-1<<"
";
    
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin >> n;
    
    while(n--) solve();
    
    return 0;
}