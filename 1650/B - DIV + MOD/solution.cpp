#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    long long l , r , a;
    cin >> l >> r >> a;
    long long divv1 = r/a;
    long long bestEle = divv1*a;
    long long res1 = -1;
    long long res2 = -1;
    if((bestEle-1)>=l&&(bestEle-1)<=r){
        res1 = (bestEle-1)/a + (bestEle-1)%a;
    }
    res2 = divv1 + r%a;
    cout<<max(res1 , res2)<<"
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