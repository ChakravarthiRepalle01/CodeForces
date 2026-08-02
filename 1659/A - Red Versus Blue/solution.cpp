#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , r , b;
    cin >> n >> r >> b;
    string s = "";
    
    int buckets = b+1;
    int base_r = r/buckets;
    int extra_r = r%buckets;
    
    for(int i = 0 ; i<buckets ; i++){
        int curr_size = base_r + (extra_r>0 ? 1 : 0);
        if(extra_r>0) extra_r--;
        
        for(int j = 0 ; j<curr_size ; j++) s+= 'R';
        
        if(b>0) s+='B';
        b--;
    }
    
    cout<<s<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n;
    cin >> n;
    while(n--) solve();
    return 0;
}