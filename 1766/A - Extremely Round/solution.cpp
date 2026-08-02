#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    int length = 0;
    int firstDigit = n;
    int temp = n;
    
    while(temp>0){
        temp = temp/10;
        if(temp!=0) firstDigit = temp;
        length++;
    }
    
    int res = 9*length - (9-firstDigit);
    cout<<res<<"
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