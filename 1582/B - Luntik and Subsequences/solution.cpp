#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    int zeroCount = 0;
    int oneCount = 0;
    
    for(int i = 0 ; i<n ; i++){
        int ele;
        cin >> ele;
        if(ele==0) zeroCount++;
        else if(ele==1) oneCount++;
    }
    
    long long totalCount = oneCount*pow(2 , zeroCount);;
    cout<<totalCount<<"
";
    
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cout.tie(nullptr);
    cin.tie(nullptr);
    
    int n;
    cin >> n;
    
    while(n){
        solve();
        n--;
    }
    return 0;
}