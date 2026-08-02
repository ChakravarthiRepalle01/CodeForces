#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int score = 0;
    
    for(int i = 1 ; i<=10 ; i++){
        for(int j = 1 ; j<=10 ; j++){
            char c;
            cin>>c;
            
            if(c=='X'){
                int dist = min(i , min( j , min((10-i+1) , (10-j+1))));
                score += dist;
            }
        }
    }
    cout<<score<<"
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