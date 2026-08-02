#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin>>n;
    
    vector<int> arr(n);
    
    for(int i = 0 ; i<n ; i++){
        cin >> arr[i];
    }
    
    vector<int> orgSeq;
    orgSeq.push_back(arr[0]);
    for(int i = 1 ; i<n ; i++){
        int ele = arr[i];
        if(orgSeq.back()<=ele){
            orgSeq.push_back(ele);
        }
        else{
            orgSeq.push_back(ele);
            orgSeq.push_back(ele);
        }
    }
    
    cout<<orgSeq.size()<<"
";
    
    for(int i = 0 ; i<orgSeq.size() ; i++){
        cout<<orgSeq[i]<<" ";
    }
    cout<<"
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