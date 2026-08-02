#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    long long n;
    cin>>n;
    
    long long noOfAxles = n/2;
    if(n%2!=0 || noOfAxles==1) cout<<-1<<"
";
    else{
        // Minumum
        if(noOfAxles%3==0){
            cout<<noOfAxles/3<<" ";
        }
        else{
            cout<<(noOfAxles/3 + 1)<<" ";
        }
        
        //Maximum
        cout<<noOfAxles/2<<"
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