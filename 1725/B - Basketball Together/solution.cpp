#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , d;
    cin >> n >> d;
    
    vector<int> arr(n);
    
    for(int i = 0 ; i<n ; i++) cin>>arr[i];
    
    sort(arr.begin() , arr.end());
    
    int maxTeams = 0;
    long long remPlayers = n;
    
    for(int i = n-1 ; i>=0 ; i--){
        if(remPlayers<=0) break;
        
        if(arr[i]>d){
            maxTeams++;
            remPlayers--;
        }
        else{
            long long reqPlayers = d/arr[i] + 1;
            if(remPlayers<reqPlayers) break;
            maxTeams++;
            remPlayers -= reqPlayers;
        }
    }
    cout<<maxTeams<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n = 1;
    
    while(n--) solve();
    
    return 0;
}