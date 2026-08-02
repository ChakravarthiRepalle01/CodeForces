#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    vector<int> a(n);
    vector<int> b(n);
    
    for(int i = 0 ; i<n ; i++) cin >> a[i];
    for(int i = 0 ; i<n ; i++) cin >> b[i];
    
    vector<int> max_a(2*n+1);
    vector<int> max_b(2*n+1);
    
    int streak = 1;
    for(int i = 1 ; i<n ; i++){
        if(a[i]==a[i-1]) streak++;
        else{
            max_a[a[i-1]] = max(max_a[a[i-1]] , streak);
            streak = 1;
        }
    }
    max_a[a[n-1]] = max(max_a[a[n-1]] , streak);
    
    streak = 1;
    for(int i = 1 ; i<n ; i++){
        if(b[i]==b[i-1]) streak++;
        else{
            max_b[b[i-1]] = max(max_b[b[i-1]] , streak);
            streak = 1;
        }
    }
    max_b[b[n-1]] = max(max_b[b[n-1]] , streak);
    
    long long maxConse = 0;
    for(int i = 1 ; i<(2*n+1) ; i++){
        maxConse = max(maxConse , (long long)max_a[i]+max_b[i]);   
    }
    cout<<maxConse<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n;
    cin >> n;
    
    while(n--) solve();
    
    return 0;
}