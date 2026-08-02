#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    vector<int> arr(n);
    
    for(int i = 0 ; i<n ; i++){
        cin >> arr[i];
    }
    
    long long cnt = 0;
    
    for(int i = (n-2) ; i>=0 ; i--){
        int n = arr[i];
        int x = arr[i+1];
        if(n>=x){
            
            if(x==0 || x==1&&i!=0){
                cout<<-1<<"
";
                return;
            }
            
            int k = log2(n/x);
            k++;
            arr[i] /= pow(2,k);
            cnt += (k);
        }
    }
    
    cout<<cnt<<"
";
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