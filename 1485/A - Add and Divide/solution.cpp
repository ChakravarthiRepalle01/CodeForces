#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int a , b;
    int minOp = INT_MAX;
    cin >> a >> b;
    
    if(a==0){
        cout<<0<<"
";
        return;
    }
    
    for(int i = 0 ; i<=30 ; i++){
        int curr_b = b+i;
        if(curr_b<2) continue;
        int op = i;
        int temp_a = a;
        while(temp_a>0){
            temp_a /= curr_b;
            op++;
        }
        minOp = min(minOp,op);
    }
    cout<<minOp<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n ;
    cin >> n;
    while(n--){
        solve();
    }
    return 0;
}