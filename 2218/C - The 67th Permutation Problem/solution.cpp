#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    vector<int> arr(3*n);
    int i = 1;
    int j = 3*n;
    int idx = 0;
    for(int k = 0 ; k<n ; k++){
        arr[idx++] = j--;
        arr[idx++] = j--;
        arr[idx++] = i++;
    }
    
    for(int k = 0 ; k<3*n ; k++){
        cout<<arr[k]<<" ";
    }
    cout<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n;
    cin >> n;
    while(n){
        solve();
        n--;
    }
    return 0;
}