#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    vector<int> a(n);
    
    int maxElement = -1;
    int freq = 0;
    
    for(int i = 0 ; i<n ; i++){
        int ele;
        cin>>ele;
        
        a[i] = ele;
        
        if(ele>maxElement){
            maxElement = ele;
            freq=1;
        }
        else if(ele==maxElement) freq++;
    }
    
    if(freq==n){
        cout<<-1<<"
";
        return;
    }
    
    cout<<(n-freq)<<" "<<freq<<"
";
    
    for(int i = 0 ; i<n ; i++){
        if(a[i]!=maxElement){
            cout<<a[i]<<" ";
        }
    }
    cout<<"
";
    
    for(int i = 0 ; i<freq ; i++){
        cout<<maxElement<<" ";
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