#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , x;
    cin >> n >> x;
    
    vector<int> arr(n);
    
    for(int i = 0 ; i<n ; i++) cin>>arr[i];
    
    long long l1 = arr[0]-x;
    long long r1 = arr[0]+x;
    int ansCnt = 0;
    
    for(int i = 1 ; i<n ; i++){
        long long l2 = arr[i]-x;
        long long r2 = arr[i]+x;
        
        int rangeStart = max(l1,l2);
        int rangeEnd = min(r1,r2);
        
        if(rangeStart>rangeEnd){
            ansCnt++;
            l1 = l2;
            r1 = r2;
        }
        else{
            l1=rangeStart;
            r1 =rangeEnd;
        }
    }
    cout<<ansCnt<<"
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