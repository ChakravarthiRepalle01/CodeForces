#include<bits/stdc++.h>
 
using namespace std;
 
void solve(){
    int n;
    cin >> n;
    
    bool isThree = false;
    int noOfDots = 0;
    int cons = 0;
    
    for(int i = 0 ; i<n ; i++){
        char c;
        cin>>c;
        
        if(c=='.'){
            noOfDots++;
            cons++;
            if(cons>=3) isThree = true;
        }
        else{
            cons = 0;
        }
    }
    
    if(isThree){
        cout<<2<<"
";
    }
    else{
        cout<<noOfDots<<"
";
    }
    
}
 
int main(){
    
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n;
    cin >> n;
    while(n){
        solve();
        n--;
    }
    return 0;
}