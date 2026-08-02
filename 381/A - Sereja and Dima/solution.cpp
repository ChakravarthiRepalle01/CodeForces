#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    vector<int> arr(n);
    for(int i = 0 ; i<n ; i++) cin >> arr[i];
    
    int i = 0 ;
    int j = n-1;
    int s = 0;
    int d = 0;
    int turn = 1;
    
    while(i<=j){
        if(arr[i]>=arr[j]){
            if(turn==1) s += arr[i];
            else d += arr[i];
            i++;
        }
        else{
            if(turn==1) s += arr[j];
            else d += arr[j];
            j--;
        }
        turn = abs(turn-1);
    }
    cout<<s<<" "<<d<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n = 1;
    // cin >> n;
    while(n){
        solve();
        n--;
    }
    return 0;
}