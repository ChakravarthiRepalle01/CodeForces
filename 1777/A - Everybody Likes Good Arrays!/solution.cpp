#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    vector<int> arr(n);
    
    for(int i = 0 ; i<n ; i++){
        cin >> arr[i];
    }
    
    int minOperations = 0;
    int freqEven = 0;
    int freqOdd = 0;
    
    for(int i = 0 ; i<n ; i++){
        if(arr[i]%2==0){
            if(freqOdd>0) minOperations += freqOdd-1;
            freqOdd=0;
            freqEven++;
        }
        else{
            if(freqEven>0) minOperations += freqEven-1;
            freqEven = 0;
            freqOdd++;
        }
    }
    if(freqEven>0) minOperations += freqEven-1;
    if(freqOdd>0) minOperations += freqOdd-1;
    cout<<minOperations<<"
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