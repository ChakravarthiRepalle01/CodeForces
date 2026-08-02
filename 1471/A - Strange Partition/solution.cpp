#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , x;
    cin >> n >> x;
    
    long long totalSum = 0;
    long long eachSum = 0;
    
    for(int i = 0 ; i<n ; i++){
        int ele;
        cin >> ele;
        totalSum += ele;
        eachSum += (ele+x-1)/x;
    }
    totalSum = (totalSum+x-1)/x;
    cout<<totalSum<<" "<<eachSum<<"
"; 
    
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin >> n;
    
    while(n--) solve();
    
    return 0;
}