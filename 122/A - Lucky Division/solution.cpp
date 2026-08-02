#include<bits/stdc++.h>
 
using namespace std;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int luckyNum[] = {4,7,44,47,74,77,444,447,474,477,744,747,774,777};
    int n;
    int len = sizeof(luckyNum) / sizeof(luckyNum[0]);
    cin >> n;
    for(int i = 0 ; i<len ; i++){
        if(n%luckyNum[i]==0){
            cout<<"YES" <<"
";
            return 0;
        }
    }
    cout<<"NO"<<"
";
    
    return 0;
}