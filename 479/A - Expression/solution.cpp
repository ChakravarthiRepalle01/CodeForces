#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int a , b , c;
    cin >> a;
    cin >> b;
    cin >> c;
    int maxVal = a+b+c;;
    maxVal = max(maxVal,a+b*c);
    maxVal = max(maxVal,a*(b+c));
    maxVal = max(maxVal,a*b*c);
    maxVal = max(maxVal,a*b+c);
    maxVal = max(maxVal,(a+b)*c);
    cout<<maxVal<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n = 1;
    while(n){
        solve();
        n--;
    }
    return 0;
}