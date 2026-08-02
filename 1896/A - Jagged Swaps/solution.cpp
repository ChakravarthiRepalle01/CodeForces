#include<bits/stdc++.h>
 
using namespace std;
 
 
void solve(){
    int n;
    cin >> n;
    
    vector<int> arr(n);
    
    for(int i =0 ; i<n ; i++){
        cin >> arr[i];
    }
    
    for(int i = 1 ; i<n ; i++){
        if(arr[i]<arr[i-1]){
            bool peak = false;
            
            if((i-1)==0) peak = false;
            else if(arr[i-1]>arr[i-2] && arr[i-1]>arr[i]) peak = true;
            else peak = false;
            
            if(peak){
                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
                
                if(arr[i-1]<arr[0]){
                    cout<<"NO"<<"
";
                    return;
                }
                
            }
            else{
                cout<<"NO"<<"
";
                return;
            }
        }
    }    
    cout<<"YES"<<"
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