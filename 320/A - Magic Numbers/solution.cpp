#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    int freq = 0;
    int lastDigit = -1;
    
    while(n>0){
        int k = n%10;
        if(k==1){
            freq = 0;
        }
        else if(k==4){
            freq++;
            if(freq>2){
                cout<<"NO"<<"
";
                return;
            }
        }
        else{
            cout<<"NO"<<"
";
            return;
        }
        lastDigit = k;
        n /= 10;
    }
    if(lastDigit==4) cout<<"NO"<<"
";
    else cout<<"YES"<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n = 1;
    // cin >> n;
    while(n){
        solve();
        n--;
    }
    return 0;
}