#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    int noOfTwo = 0;
    vector<int> arr(n);
    
    for(int  i = 0 ; i<n ; i++){
        cin >> arr[i];
        if(arr[i]==2) noOfTwo++;
    }
    
    if(noOfTwo%2!=0) cout<<-1<<"
";
    else{
        int req = noOfTwo/2;
        for(int i = 0 ; i<n ; i++){
            if(arr[i]==2) req--;
            if(req==0){
                cout<<(i+1)<<"
";
                break;
            }
        }
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