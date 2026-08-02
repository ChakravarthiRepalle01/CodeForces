#include<bits/stdc++.h>
 
using namespace std; // 3 2 3 2 3
 
void solve(){
    int a , b;
    cin >> a >> b;
    int totalCnt = a;
    
    int xxor = -1;
    if((a-1)%4==0) xxor = a-1;
    else if((a-1)%4==1) xxor = 1;
    else if((a-1)%4==2) xxor = a;
    else xxor = 0;
    
    int reqEle = xxor^b;
    
    if(b==xxor);
    else if(reqEle==a) totalCnt += 2;
    else totalCnt++;
    cout<<(totalCnt)<<"
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