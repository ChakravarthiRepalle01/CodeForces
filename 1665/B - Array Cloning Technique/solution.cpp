#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    map<int,int> hashMap;
    
    for(int i = 0 ; i<n ; i++){
        int ele;
        cin >> ele;
        hashMap[ele]++;
    }
    
    int maxCount = 0;
    
    for (const auto& pair : hashMap) {
       maxCount = max(maxCount , pair.second);
    }
    
    int replace = n - maxCount;
    int operations = 0;
    
    while(replace>0){
        operations += 1+min(replace , maxCount);
        replace -= maxCount;
        maxCount *= 2;
    }
    cout<<operations<<"
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