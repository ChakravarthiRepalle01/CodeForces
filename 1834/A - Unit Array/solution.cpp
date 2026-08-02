#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n ; 
    cin >> n;
    
    int sum = 0 , minus = 0;
    int operations = 0;
    
    for(int i = 0 ; i<n ; i++){
        int ele;
        cin>>ele;
        if(ele==-1) minus++;
        sum += ele;
    }
    
    if(sum<0){
        operations = (abs(sum)+1)/2;
        sum += 2*operations;
        minus -= operations;
    }
    
    if(minus%2!=0){
        operations++;
        minus--;
    }
    cout<<operations<<"
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