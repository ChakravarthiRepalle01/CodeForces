#include<bits/stdc++.h>
 
using namespace std;
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin >> n;
    
    int ele;
    cin >> ele;
    ele = abs(ele);
    
    for(int i = 1 ; i<n ; i++){
        int k;
        cin >> k;
        ele = min(ele , abs(k));
    }
    cout<<ele<<"
";
    return 0;
}