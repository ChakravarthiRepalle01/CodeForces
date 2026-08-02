#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    long long a , b , n;
    cin >> a >> b >> n;
    
    vector<long long> tools(n);
    for(int i = 0 ; i<n ; i++){
        cin >> tools[i];
    }
    
    long long totalTime = (b-1);
    for(int i = 0 ; i<n ; i++){
        totalTime += min(tools[i], a-1); 
    }
    
    cout<<(totalTime+1)<<"
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