#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    vector<int> arr(n);
    map<int , int> hashmap;
    for(int i = 0 ; i<n ; i++){
        cin>>arr[i];
    }
    
    if(n==2){
        cout << "YES" <<"
";
        return;
    }
    
    for(int i = 0 ; i<n ; i++){
        hashmap[arr[i]]++;
    }
    
    if(hashmap.size()==1){
        cout<<"YES"<<"
";
    }
    else if(hashmap.size()==2){
        int freq[2];
        int idx = 0;
        for(const auto& pair : hashmap){
            freq[idx++] = pair.second;
        }
        
        if(freq[0]==freq[1] || freq[0]==freq[1]+1 || freq[1]==freq[0]+1){
            cout<<"YES"<<"
";
        }
        else{
            cout<<"NO"<<"
";
        }
        
    }
    else{
        cout<<"NO"<<"
";
    }
    
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