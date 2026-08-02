#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n , h;
    cin >> n >> h;
    int w = 0;
    for(int i = 0 ; i<n ; i++){
        int ele;
        cin >> ele;
        if(ele>h) w = w+2;
        else w = w+1;
    }
    cout<<w<<"
";
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int n = 1;
    while(n){
        solve();
        n--;
    }
    return 0;
}