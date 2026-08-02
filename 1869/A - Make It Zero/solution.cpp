#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    for(int i = 0 ; i<n ; i++){
        int ele;
        cin >> ele;
    }
    
    if(n%2==0){
        cout<<2<<"
";
        cout<<1<<" "<<n<<"
";
        cout<<1<<" "<<n<<"
";
    }
    else{
        cout<<4<<"
";;
        cout<<1<<" "<<n<<"
";
        cout<<1<<" "<<(n-1)<<"
";
        cout<<(n-1)<<" "<<n<<"
";
        cout<<(n-1)<<" "<<n<<"
";
    }
    
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