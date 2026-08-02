#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    long long a , b , c , m;
    cin >> a >> b >> c >> m;
    
    long long ad = m/a;
    long long bd = m/b;
    long long cd = m/c;
    long long abd = m/lcm(a,b);
    long long bcd = m/lcm(c,b);
    long long cad = m/lcm(a,c);
    long long abcd = m/lcm(a,lcm(b,c));
    
    long long onlyABC = abcd;
    long long onlyAB = abd - abcd;
    long long onlyBC = bcd-abcd;
    long long onlyCA = cad-abcd;
    long long onlyA = ad - onlyAB - onlyCA - onlyABC;
    long long onlyB = bd - onlyAB - onlyBC - onlyABC;
    long long onlyC = cd - onlyCA - onlyBC - onlyABC;
    
    long long ansA = onlyA*6+onlyAB*3 + onlyCA*3 + onlyABC*2;
    long long ansB = onlyB*6+onlyAB*3 + onlyBC*3 + onlyABC*2;
    long long ansC = onlyC*6+onlyCA*3 + onlyBC*3 + onlyABC*2;
    cout<<ansA<<" "<<ansB<<" "<<ansC<<"
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