#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n ;
    
    for(int i = 0 ; i<n ; i++){
        int ele;
        cin >> ele;
        
        cout << ((n+1)-ele) << " ";
    }
    cout<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin>>n;
    
    while(n){
        solve();
        n--;
    }
    return 0;
}