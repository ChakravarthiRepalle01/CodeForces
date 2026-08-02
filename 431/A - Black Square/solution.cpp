#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    
    int x1 , x2 , x3 , x4;
    cin >> x1 >> x2 >> x3 >> x4;
    
    string s;
    cin >> s;
    
    int n = s.size();
    int sum = 0;
    
    for(int i = 0 ; i<n ; i++){
        int k = (int)(s[i]-'0');
        if(k==1) sum += x1;
        else if(k==2) sum += x2;
        else if(k==3) sum += x3;
        else sum += x4;
    }
    cout<<sum<<"
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