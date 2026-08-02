#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    string s;
    cin>>s;
    
    int i = 0 ;
    int j = n-1;
    
    while(i<j){
        if(!(s[i]=='1'&&s[j]=='0' || s[i]=='0'&&s[j]=='1')) break;
        
        i++;
        j--;
    }
    
    if(i==j) cout<<1<<"
";
    else if(i>j) cout<<0<<"
";
    else cout<<(j-i+1)<<"
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