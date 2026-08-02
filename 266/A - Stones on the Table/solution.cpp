#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    string s;
    cin >> s;
    char prev = s[0];
    int j = 1;
    int rem = 0;
    while(j<n){
        if(s[j]==prev){
            rem++;
        }
        else{
            prev = s[j];
        }
        j++;
    }
    cout<<rem<<"
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