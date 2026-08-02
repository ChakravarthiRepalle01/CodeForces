#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , k;
    cin >> n >> k;
    string s;
    cin >> s;
    
    vector<int> arr(26);
    for(int i = 0 ; i<n ; i++){
        arr[s[i]-'a']++;
    }
 
    int even = 0;
    int odd = 0;
    for(int i = 0 ; i<26 ; i++){
        if(arr[i]%2!=0) odd++;
        even += arr[i]/2;
    }
    
    int firstFill = (n-k)/2;
    even -= firstFill;
    
    if(even<0){
        cout<<"NO"<<"
";
        return;
    }
    int remain = even*2 + odd;
    if((n-k)%2!=0) remain--;
    
    if(remain==k) cout<<"YES"<<"
";
    else cout<<"NO"<<"
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