#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    int sum = 0;
    for(int i = 0 ; i<n-1 ; i++){
        int ele;
        cin>>ele;
        sum += ele;
    }
    cout <<-sum<<"
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