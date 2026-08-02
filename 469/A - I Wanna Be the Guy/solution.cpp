#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    set<int> hashSet;
    int n;
    cin >> n;
    
    int p;
    cin >> p;
    for(int i = 0 ; i<p ; i++){
        int ele;
        cin >> ele;
        hashSet.insert(ele);
    }
    
    int q;
    cin >> q;
    for(int i = 0 ; i<q ; i++){
        int ele;
        cin >> ele;
        hashSet.insert(ele);
    }
    
    if(hashSet.size()==n) cout<<"I become the guy."<<"
";
    else cout<<"Oh, my keyboard!"<<"
";
    
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n = 1;
    // cin >> n;
    while(n){
        solve();
        n--;
    }
    return 0;
}