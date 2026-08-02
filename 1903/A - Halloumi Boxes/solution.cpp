#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , k;
    cin >> n >> k;
    
    int a[n];
    bool isSorted = true;
    for(int i = 0 ; i<n ; i++){
        if(i==0){
            cin>>a[i];
        }
        else{
            cin >> a[i];
            if(a[i]<a[i-1]) isSorted = false;
        }
    }
    
    if(k==1 && !isSorted){
        cout<<"NO"<<"
";
    }
    else{
        cout<<"YES"<<"
";
    }
}
 
int main(){
    int n;
    cin>>n;
    while(n){
        solve();
        n--;
    }
    return 0;
}