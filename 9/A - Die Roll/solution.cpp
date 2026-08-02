#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int y , w;
    cin >> y >> w;
    int maxPoints = max(y,w);
    
    int n = (6-maxPoints+1);
    if(n==1) cout<<"1/6"<<"
";
    else if(n==2) cout<<"1/3"<<"
";
    else if(n==3) cout<<"1/2"<<"
";
    else if(n==4) cout<<"2/3"<<"
";
    else if(n==5) cout<<"5/6"<<"
";
    else cout<<"1/1"<<"
";
    
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n = 1 ;
    // cin >> n;
    while(n){
        solve();
        n--;
    }
    return 0;
}